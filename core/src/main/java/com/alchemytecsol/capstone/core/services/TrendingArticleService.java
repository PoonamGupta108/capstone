package com.alchemytecsol.capstone.core.services;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;

import com.alchemytecsol.capstone.core.models.ArticleBannerModel;

public interface TrendingArticleService {
	
	public ResourceResolver getResourceResolver();
	
	public List<ArticleBannerModel> getTrendingArticles();

}
