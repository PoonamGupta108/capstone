package com.alchemytecsol.capstone.core.dto;
/**
 *      @author Poonam Kumari
 *      
 *      Dto class for capstone core part
 *
 */
public class YoutubeVideoResponse {

	private String html;
	
	private String title;
	
	private String thumbnailUrl;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	
	
}
