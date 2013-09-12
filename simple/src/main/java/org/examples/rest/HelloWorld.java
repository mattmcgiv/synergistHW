package org.examples.rest;

import javax.jws.WebService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/names")
public class HelloWorld {

    @GET
    @Path("/{input}")
    @Produces("text/plain")
    public String ping(@PathParam("input") String input) {
        return "hello, " + input;
    }

}
