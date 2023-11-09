package br.com.fiuza.controller;

import java.util.List;

import br.com.fiuza.model.Validity;
import br.com.fiuza.service.ValidityService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;

@Path("/validity")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ValidityController {
    
    @Inject
    ValidityService validityService;

    @GET
    public List<Validity> get() {
        return validityService.get();
    }

}
