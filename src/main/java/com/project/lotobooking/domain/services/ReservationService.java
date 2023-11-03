package com.project.lotobooking.domain.services;

import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.domain.ports.primary.IPrimaryReservation;
import com.project.lotobooking.domain.ports.secondary.IReservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IPrimaryReservation {

    IReservation iReservation;

    public ReservationService(IReservation iReservation) {
        this.iReservation = iReservation;
    }


    @Override
    public List<Reservations> getAllReservation() {
        return iReservation.getAllReservation();
    }

    @Override
    public Reservations getReservationById(Long idReservation) {
        return iReservation.getReservationById(idReservation);
    }

    @Override
    public Reservations creerReservation(Reservations reservations) {
        return iReservation.creerReservation(reservations);
    }

    @Override
    public void supprimerReservation(Long idReservation) {
        iReservation.supprimerReservation(idReservation);
    }
}
