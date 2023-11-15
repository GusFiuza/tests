package br.com.fiuza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Position {
    private Long positionId;
    private String positionName;

    public Position(Long positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }
    
}
