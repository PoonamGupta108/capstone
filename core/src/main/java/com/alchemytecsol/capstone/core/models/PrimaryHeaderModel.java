package com.alchemytecsol.capstone.core.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PrimaryHeaderModel {
	
	@ValueMapValue
	private String treandingText; 
	
	@ValueMapValue
	private String treandingDesc;
	
	private String todayDateStr;
		
   @PostConstruct
   public void init() {
	   
	   SimpleDateFormat format = new SimpleDateFormat("EEEE,d MMMM yyyy");
	   todayDateStr = format.format(new Date());
	   
	   
   }

public String getTreandingText() {
	return treandingText;
}

public String getTreandingDesc() {
	return treandingDesc;
}

public String getTodayDateStr() {
	return todayDateStr;
}
   
}
