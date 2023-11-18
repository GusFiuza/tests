package br.com.fiuza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reference {
    private Long validityId;
    private Long positionId;
    private Float income;

    public Reference(Long validityId, Long positionId, Float income) {
        this.validityId = validityId;
        this.positionId = positionId;
        this.income = income;
    }
}
