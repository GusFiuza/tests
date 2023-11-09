package br.com.fiuza.controller;

import br.com.fiuza.entity.ReferenceEntity;
import br.com.fiuza.model.Reference;
import br.com.fiuza.service.ReferenceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/reference")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReferenceController {

    @Inject
    ReferenceService referenceService;

    @GET
    public List<Reference> get() {
        return referenceService.get();
    }

    @GET
    @Path("{id}")
    public Reference getById(@PathParam("id") Long id) {
        return referenceService.getById(id);
    }

    @POST
    public ReferenceEntity create(Reference reference) {
        ReferenceEntity referenceEntity = referenceService.create(reference);
        return referenceEntity;
    }

    @PUT
    public ReferenceEntity update(Reference reference) {
        ReferenceEntity referenceEntity = referenceService.update(reference);
        return referenceEntity;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        referenceService.delete(id);
    }

}
