package com.alchemytecsol.capstone.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 *      @author Poonam Kumari
 * 
 *      Sling Model to fetch Footer Component properties
 *
 */

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterModel {

	
	@ValueMapValue
	private String footerLogo;
	
	@ValueMapValue
	private String aboutText;

	public String getFooterLogo() {
		return footerLogo;
	}

	public String getAboutText() {
		return aboutText;
	}
	
	
}
