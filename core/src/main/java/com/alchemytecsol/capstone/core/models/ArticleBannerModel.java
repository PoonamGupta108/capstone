package com.alchemytecsol.capstone.core.models;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 *      @author Poonam Kumari
 * 
 *      Sling Model to fetch Banner Article Component properties
 *
 */

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticleBannerModel {

	@ValueMapValue
	private String bannerImage;
	
	@ValueMapValue
	private String banerText;
	
	@ValueMapValue(name = "jcr:created")
	private Date jcrCreated;
	
	private String createdDateStr;
	
	 private String pagePath;
	 
	@PostConstruct
	public void init() {
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM d,yyyy");
		createdDateStr = formatter.format(jcrCreated);
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public String getBanerText() {
		return banerText;
	}

	public String getCreatedDateStr() {
		return createdDateStr;
	}

	public String getPagePath() {
		return pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}
	
}
