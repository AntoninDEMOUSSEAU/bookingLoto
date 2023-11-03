package com.project.lotobooking.infrastructure.adapters;

import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.domain.ports.secondary.IReservation;
import com.project.lotobooking.infrastructure.converter.ReservationsMapper;
import com.project.lotobooking.infrastructure.repositoy.EvenementRepository;
import com.project.lotobooking.infrastructure.repositoy.ReservationRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class ReservationAdapter implements IReservation {

    EvenementAdapter evenementAdapter;
    EvenementRepository evenementRepository;

    ReservationsMapper reservationsMapper;
    ReservationRepository  reservationRepository;

    @Override
    public List<Reservations> getAllReservation() {
        return reservationsMapper.toReservations(reservationRepository.findAll());
    }

    @Override
    public Reservations getReservationById(Long idReservation) {
        return reservationRepository.findAll()
                .stream()
                .filter(reservations -> Objects.equals(reservations.getIdReservation(),idReservation) )
                .findFirst()
                .map(reservationsMapper::toReservation)
                .orElse(null);
    }

    @Override
    public Reservations creerReservation(Reservations reservations) {
        return reservationsMapper.toReservation(reservationRepository.save(reservationsMapper.fromReservation(reservations)));
    }

    @Override
    public void supprimerReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
