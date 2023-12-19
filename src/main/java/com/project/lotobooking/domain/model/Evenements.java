package com.project.lotobooking.domain.model;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Evenements {
    private Long id;
    private Date date;
    private Salles salle;
    private List<Reservations> reservation;

    //methode permettant de savoir si un evenement est complet.
    public boolean estComplet(Evenements evenements){
        if(evenements.getSalle().capaciteAssis() == evenements.getReservation().size() ){
            return true;
        }
        return false;
    }


}
