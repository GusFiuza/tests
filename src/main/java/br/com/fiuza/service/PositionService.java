package br.com.fiuza.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fiuza.entity.PositionEntity;
import br.com.fiuza.model.Position;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PositionService {
    public List<Position> get() {
        List<PositionEntity> listAll = PositionEntity.findAll().list();
        return listAll.stream().map(ie -> {
            return new Position(ie.positionId, ie.positionName);
        }).collect(Collectors.toList());
    }
    
}
