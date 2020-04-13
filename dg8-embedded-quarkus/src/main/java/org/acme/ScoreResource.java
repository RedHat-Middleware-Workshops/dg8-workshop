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

    @Inject
    ScoreService scoreService;

    @OPTIONS
    public Response opt() {
        return Response.ok().build();
    }

    @GET
    @Path("/hello")
    public String hello() {
        return "hello";
    }

    @GET
    public List<Score> getAll() {
        return scoreService.getAll();
    }

    @GET
    @Path("/{id}")
    public Object getOne(@PathParam("id") String id) {
        Object entity = scoreService.findById(id);
        if (entity == null) {
            throw new WebApplicationException("ScoreCard with id of " + id + " does not exist.", Status.NOT_FOUND);
        }
        return entity;
    }


    @POST
    @Transactional
    public Response create(@Valid Score item) {
        scoreService.save(item);
        return Response.status(Status.CREATED).entity(item).build();
    }

    @PATCH
    @Path("/{id}")
    @Transactional
    public Response update(@Valid Score card, @PathParam("id") Long id) {
        scoreService.save(card);
        return Response.status(Status.CREATED).entity(card).build();

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