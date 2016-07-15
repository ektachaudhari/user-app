package com.project.userapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user")
public class UserController {

	private @Context HttpServletRequest httpServletRequest;

	@GET
	@Path("list")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)

	public Response getResponse() {
		return Response.ok("welcome", MediaType.TEXT_PLAIN).build();
	}

}
