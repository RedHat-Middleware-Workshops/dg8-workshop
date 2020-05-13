package org.acme;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api")
public class ScoreResource {

    // Inject ScoreService

    // Implement the create end point

    // To be able to get one entry

    // To update an entry

    @OPTIONS
    public Response opt() {
        return Response.ok().build();
    }

    @GET
    @Path("/hello")
    public String hello() {
        return "hello";
    }

 

    @DELETE
    @Transactional
    public Response delete() {
        return Response.noContent().build();
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public Response deleteOne(@PathParam("id") Long id) {
        return Response.noContent().build();
    }

}