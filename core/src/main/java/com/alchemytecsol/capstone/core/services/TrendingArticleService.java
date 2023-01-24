package com.alchemytecsol.capstone.core.services;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;

import com.alchemytecsol.capstone.core.models.ArticleBannerModel;

/**
 *      @author Poonam Kumari
 * 
 *      Service interface for TrendingArticlesModel Sling Model
 *
 */

public interface TrendingArticleService {
	/**
	 *     To get the resolver for Trending Articles Service
	 */
	
	public ResourceResolver getResourceResolver();
	
	/**
	 *     To get the list of Articles to display
	 *     in Trending Articles Component
	 */
	
	public List<ArticleBannerModel> getTrendingArticles();

}
