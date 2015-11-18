package com.exp.lifeline.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exp.lifeline.entity.Employee;
import com.exp.lifeline.service.LoginService;
@Component
@Path("/hello")
public class PaymentService {

	@Autowired
	LoginService loginService;

	@GET
	@Path("/first/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee savePayment(@PathParam("userId")int val1) {

		Employee emp = loginService.searchEmployee(val1).get(0);
		/*System.out.println(loginService.searchEmployee(1, "1").get(0));*/
		//return loginService.searchEmployee(1, "1").get(0);
		/*String result = loginService.searchEmployee(1, "1").get(0).toString();*/
		/*Gson gson = new Gson();
		String json = gson.toJson(emp);*/
		//return Response.status(200).entity(json).build();
		return emp;

	}
	 /*@POST
	    @Produces("application/json")
	   
	    @Path("/jsonBean")
	    public Response modifyJson(JsonBean input) {
		input.setVal2(input.getVal1());
		return Response.ok().entity(input).build();
	    }*/
}