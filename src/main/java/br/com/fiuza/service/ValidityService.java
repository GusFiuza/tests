package br.com.fiuza.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fiuza.entity.ValidityEntity;
import br.com.fiuza.model.Validity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ValidityService {
    public List<Validity> get() {
        List<ValidityEntity> listAll = ValidityEntity.findAll().list();
        return listAll.stream().map(ie -> {
            return new Validity(ie.validityId, ie.validityName);
        }).collect(Collectors.toList());
    }
    
}
