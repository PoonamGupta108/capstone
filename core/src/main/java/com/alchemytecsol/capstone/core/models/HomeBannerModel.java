package com.alchemytecsol.capstone.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomeBannerModel {
	
	@ValueMapValue
	private String[] articleLinks;
	
	@SlingObject
	ResourceResolver resolver;
	
	List<ArticleBannerModel> bannerList;
	
	@PostConstruct
	public void init() {
		if(articleLinks != null) {
			
				bannerList = new ArrayList<>();
				for (String articleLink : articleLinks) {
				// /content/capstone/us/en/articles/stories
				// /content/capstone/us/en/articles/stories/jcr:content/root/container/article_banner
			Resource articleResource = resolver.getResource(articleLink+"/jcr:content/root/container/article_banner");
			if(articleResource != null) {
				ArticleBannerModel aricleBanner =	articleResource.adaptTo(ArticleBannerModel.class);
				
				if(aricleBanner != null) {
					aricleBanner.setPagePath(articleLink);
					
					
					if(bannerList.size()<=5) {
						bannerList.add(aricleBanner);
					}
				}
			}
			}
		}
		
	}

	public List<ArticleBannerModel> getBannerList() {
		return bannerList;
	}

	

}
