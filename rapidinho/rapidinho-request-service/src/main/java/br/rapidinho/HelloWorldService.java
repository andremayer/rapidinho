package br.rapidinho;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Nova encomenda : " + msg;
		System.out.println("Nova encomenda : " + msg);
		return Response.status(200).entity(output).build();

	}

	@POST
	@Path("/{param}")
	public Response postMsg(@PathParam("param") String msg) {
		String output = "POST:Jersey say : " + msg;
		System.out.println("POST:Jersey say : " + msg);
		return Response.status(200).entity(output).build();
	}

	@POST
	@Path("/post")
	// @Consumes(MediaType.TEXT_XML)
	public Response postStrMsg(String msg) {
		String output = "POST:Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}

	@PUT
	@Path("/{param}")
	public Response putMsg(@PathParam("param") String msg) {
		String output = "PUT: Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}

	@DELETE
	@Path("/{param}")
	public Response deleteMsg(@PathParam("param") String msg) {
		String output = "DELETE:Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}

	@HEAD
	@Path("/{param}")
	public Response headMsg(@PathParam("param") String msg) {
		String output = "HEAD:Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}

}