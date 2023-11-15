package br.com.fiuza.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "position")
public class PositionEntity extends PanacheEntityBase{
    
    @Id
    public Long positionId;

    @Column(name = "positionName")
    public String positionName;
}
