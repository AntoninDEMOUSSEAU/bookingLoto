package com.project.lotobooking.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Reservations {
    private Long id;
    private Evenements evenement;
    private Utilisateurs utilisateur;
    private Integer nbResa;
    
}
