package org.sample.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Path("/employee")
@Api(value="employee", description="Sample Employee details application")
public class EmployeeDetails {
	
	@GET
	@Path("/emp/{id}")
	@ApiOperation(value="just to test the sample employee id api")
	public Response getMsg(@ApiParam(value="param",required=true) @PathParam("id") String id ) {
 
		String output = "Hello : " + id;
 
		return Response.status(200).entity(output).build();
 
	}
	
	@Path("/address")
	@GET
	@ApiOperation(value="Address details")
//	@Produces(MediaType.TEXT_PLAIN)
	public String getAddress() {
		// URL : http://localhost:8080/itcrestful/itc/address
		return "ITC Infotech India Limited, 18, Banaswadi Main Rd, Maruthi Sevanagar, Bangalore, 560005";
	}

}
