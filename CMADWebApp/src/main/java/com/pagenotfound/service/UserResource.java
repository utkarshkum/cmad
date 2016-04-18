package com.pagenotfound.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.pagenotfound.model.User;

@Path("/users")
public class UserResource {
	
	 
	
	@GET
	@Path("/{param}")
	@Produces({ MediaType.APPLICATION_JSON })
	public User getUser(@PathParam("param") Integer id, @Context HttpServletRequest req) {
		System.out.println("Logged in user = "+req.getSession().getAttribute("user"));
		return new User();
	}

	
}
