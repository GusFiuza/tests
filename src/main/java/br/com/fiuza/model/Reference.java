package br.com.fiuza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reference {
    private Long id;
    private Long code;
    private Float income;

    public Reference(Long id, Long code, Float income) {
        this.id = id;
        this.code = code;
        this.income = income;
    }
}
