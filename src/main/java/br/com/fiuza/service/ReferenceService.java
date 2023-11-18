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
            return new Reference(ie.validityId, ie.positionId, ie.income);
        }).collect(Collectors.toList());
    }

    public Reference getById(Long validityId, Long positionId) {
        ReferenceEntity params = new ReferenceEntity();
        params.validityId = validityId;
        params.positionId = positionId;
        ReferenceEntity reference = ReferenceEntity.findById(params);
        return new Reference(reference.validityId, reference.positionId, reference.income);
    }

    @Transactional
    public ReferenceEntity create(Reference reference) {
        ReferenceEntity referenceEntity = new ReferenceEntity();
        referenceEntity.validityId = reference.getValidityId();
        referenceEntity.positionId = reference.getPositionId();
        referenceEntity.income = reference.getIncome();
        referenceEntity.persist();
        return referenceEntity;
    }

    // @Transactional
    // public ReferenceEntity update(Reference Reference) {
    //     ReferenceEntity entity = ReferenceEntity.findById(Reference.getValidityId(), Reference.getPositionId());
    //     entity.income = Reference.getIncome();
    //     return entity;
    // }

    // @Transactional
    // public void delete(Long validityId, Long positionId) {
    //     ReferenceEntity.deleteById(validityId, positionId);
    // }

}