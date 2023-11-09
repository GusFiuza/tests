package br.com.fiuza.service;

import br.com.fiuza.entity.ReferenceEntity;
import br.com.fiuza.model.Reference;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ReferenceService {
    public List<Reference> get() {
        List<ReferenceEntity> listAll = ReferenceEntity.findAll().list();
        return listAll.stream().map(ie -> {
            return new Reference(ie.id, ie.code, ie.income);
        }).collect(Collectors.toList());
    }

    public Reference getById(Long id) {
        ReferenceEntity reference = ReferenceEntity.findById(id);
        return new Reference(reference.id, reference.code, reference.income);
    }

    @Transactional
    public ReferenceEntity create(Reference reference) {
        ReferenceEntity referenceEntity = new ReferenceEntity();
        referenceEntity.code = reference.getCode();
        referenceEntity.income = reference.getIncome();
        referenceEntity.persist();
        return referenceEntity;
    }

    @Transactional
    public ReferenceEntity update(Reference Reference) {
        ReferenceEntity entity = ReferenceEntity.findById(Reference.getId());
        entity.code = Reference.getCode();
        entity.income = Reference.getIncome();
        return entity;
    }

    @Transactional
    public void delete(Long id) {
        ReferenceEntity.deleteById(id);
    }

}