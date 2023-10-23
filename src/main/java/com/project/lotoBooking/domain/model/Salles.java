package com.project.lotoBooking.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Salles {
    private Long id;
    private String nomSalle;
    private String adresseSalle;
    private Integer capaciteAssis;
    private Integer capaciteDebout;

}
