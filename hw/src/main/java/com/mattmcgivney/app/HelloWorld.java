package com.mattmcgivney.app;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/names")
public class HelloWorld {

    @GET
    @Path("/{in}")
    @Produces("text/plain")
    public String ping(@PathParam("in") String in) {
        return "hello, " + in;
    }
}

