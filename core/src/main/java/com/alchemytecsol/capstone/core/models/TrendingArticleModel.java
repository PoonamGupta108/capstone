package com.alchemytecsol.capstone.core.models;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.alchemytecsol.capstone.core.services.TrendingArticleService;

@Model(adaptables = {Resource.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TrendingArticleModel {

	@OSGiService
	TrendingArticleService trendingArticleService;
	
	@ValueMapValue
	private String title;
	
	List<ArticleBannerModel> bannerList;
	
	@PostConstruct
	public void init() {
		bannerList= trendingArticleService.getTrendingArticles();
	}

	public String getTitle() {
		return title;
	}

	public List<ArticleBannerModel> getBannerList() {
		return bannerList;
	}
	
	
}
