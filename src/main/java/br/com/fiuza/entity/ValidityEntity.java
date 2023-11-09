package br.com.fiuza.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "validity")
public class ValidityEntity extends PanacheEntityBase {
    
    @Id
    public Long validityId;

    @Column(name = "validityName")
    public String validityName;

}
