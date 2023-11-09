package br.com.fiuza.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Validity {
    private Long validityId;
    private String validityName;

    public Validity(Long validityId, String validityName) {
        this.validityId = validityId;
        this.validityName = validityName;
    }
}
