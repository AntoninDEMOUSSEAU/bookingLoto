package com.project.lotobooking.domain.ports.secondary;

import com.project.lotobooking.domain.model.Reservations;

import java.util.List;

public interface IReservation {

    List<Reservations> getAllReservation();

    Reservations getReservationById(Long idReservation);

    Reservations creerReservation(Reservations reservations);

    void supprimerReservation(Long idReservation);
}
