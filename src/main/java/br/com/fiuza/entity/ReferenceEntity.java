package br.com.fiuza.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reference")
public class ReferenceEntity extends PanacheEntityBase {

    @Id
    public Long code;

    @Column(name = "income")
    public Float income;

}
