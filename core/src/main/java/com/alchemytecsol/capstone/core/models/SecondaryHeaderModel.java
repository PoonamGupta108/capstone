package com.alchemytecsol.capstone.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

/**
 *      @author Poonam Kumari
 * 
 *      Sling Model to fetch  Header Secondary Component properties
 *
 */

public class SecondaryHeaderModel {
	
	@ValueMapValue
	private String logo;
	
	@ValueMapValue
	private String[] languages;
	
	@ValueMapValue
	private Boolean displayLanguages;

	public String getLogo() {
		return logo;
	}

	public String[] getLanguages() {
		return languages;
	}

	public Boolean getDisplayLanguages() {
		return displayLanguages;
	}
	
	

}
