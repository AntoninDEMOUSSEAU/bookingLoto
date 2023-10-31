package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.infrastructure.entity.EvenementsEntity;


public class EvenementsConverter {

    private static SallesMapper sallesMapper;
    private static ReservationsMapper reservationsMapper;

    public EvenementsConverter(SallesMapper sallesMapper, ReservationsMapper reservationsMapper) {
        this.sallesMapper = sallesMapper;
        this.reservationsMapper = reservationsMapper;
    }

    //Méthode permettant de faire communiquer mon infra vers mon domaine (exemple récupérer un evenement)
    public Evenements fromEntity(EvenementsEntity evt) {

        return Evenements.builder()
                .id(evt.getIdEvenement())
                .date(evt.getDate())
                .salle(sallesMapper.toSalles(evt.getSalles()))
                .reservation(reservationsMapper.toReservations(evt.getReservations()))
                .build();

        //Méthode permettant de faire communiquer mon domaine vers mon infra (exemple création d'un Evenement)
    }
    public static EvenementsEntity fromModel(Evenements evt){
           return EvenementsEntity.builder()
                   .idEvenement(evt.getId())
                   .date(evt.getDate())
                   .salles(sallesMapper.fromSalles(evt.getSalle()))
                   .reservations(reservationsMapper.fromReservation(evt.getReservation()))
                   .build();
       }

    }

