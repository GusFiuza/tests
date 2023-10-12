package br.com.fiuza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Long id;
    private Long code;
    private String last_name;

    public Student(Long id, Long code, String last_name) {
        this.id = id;
        this.code = code;
        this.last_name = last_name;
    }
}
