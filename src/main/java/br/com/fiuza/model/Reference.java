package br.com.fiuza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reference {
    private Long code;
    private Float income;

    public Reference(Long code, Float income) {
        this.code = code;
        this.income = income;
    }
}
