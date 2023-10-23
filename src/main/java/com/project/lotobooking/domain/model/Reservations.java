package com.project.lotoBooking.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reservations {
    private Long id;
    private Evenements evenement;
    private Utilisateurs utilisateurs;
    private Integer nbResa;
}
