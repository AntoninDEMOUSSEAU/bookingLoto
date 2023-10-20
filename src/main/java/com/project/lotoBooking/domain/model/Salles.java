package com.project.lotoBooking.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Salles {
    public Long id;
    public String nomSalle;
    public String adresseSalle;
    public int capaciteAssis;
    public int capaciteDebout;

}
