package br.com.fiuza.controller;

import java.util.List;

import br.com.fiuza.model.Position;
import br.com.fiuza.service.PositionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/position")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PositionController {

    @Inject
    PositionService positionService;

    @GET
    public List<Position> get() {
        return positionService.get();
    }
    
}
