package com.ddlab.rest.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.jackson.JacksonFeature;


public class ApplicationPkgs1 extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(LoginServiceResource.class);
		resources.add(ITCInfotechServices.class);
		resources.add(JacksonFeature.class);
		
		resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

		
		
		return resources;
	}
	
//	public ApplicationPkgs1() {
//		super(LoginServiceResource.class,ITCInfotechServices.class,JacksonFeature.class);
//	}

}
