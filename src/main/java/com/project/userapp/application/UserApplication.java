package com.project.userapp.application;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class UserApplication extends Application{

	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(com.project.userapp.controller.UserController.class);
		return resources;
		
	}
	
}
