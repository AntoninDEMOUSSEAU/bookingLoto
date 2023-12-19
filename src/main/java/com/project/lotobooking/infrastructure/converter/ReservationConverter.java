package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.infrastructure.entity.ReservationsEntity;

public class ReservationConverter {

    private static EvenementMapper evenementMapper;
    private static UtilisateurMapper  utilisateurMapper;

    public ReservationConverter(EvenementMapper evenementMapper, UtilisateurMapper utilisateurMapper){
        this.evenementMapper = evenementMapper;
        this.utilisateurMapper = utilisateurMapper;
    }

    public Reservations fromEntity(ReservationsEntity reservationsEntity){
        return Reservations.builder()
                .id(reservationsEntity.getIdReservation())
                .evenement(evenementMapper.toEvenement(reservationsEntity.getEvenement()))
                .utilisateur(utilisateurMapper.toUtilisateur(reservationsEntity.getUtilisateur()))
                .nbResa(reservationsEntity.getNbResa())
                .build();

    }

    public ReservationsEntity toEntity(Reservations reservations){
        return ReservationsEntity.builder()
                .idReservation(reservations.getId())
                .evenement(evenementMapper.fromEvenement(reservations.getEvenement()))
                .utilisateur(utilisateurMapper.fromUtilisateur(reservations.getUtilisateur()))
                .nbResa(reservations.getNbResa())
                .build();
    }



}
