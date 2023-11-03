package com.project.lotobooking.application.controller;

import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.domain.ports.primary.IPrimaryReservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    final IPrimaryReservation iPrimaryReservation;

    public ReservationController(IPrimaryReservation iPrimaryReservation) {
        this.iPrimaryReservation = iPrimaryReservation;
    }

    @GetMapping()
    public List<Reservations> getAllReservations() {
        return iPrimaryReservation.getAllReservation();
    }
    @GetMapping("/{idReservation}")
    public Reservations getReservationById(@PathVariable Long idReservation){
        return iPrimaryReservation.getReservationById(idReservation);
    }
    @PostMapping
    public Reservations creerReservation(Reservations reservations){
        return iPrimaryReservation.creerReservation(reservations);
    }

    @DeleteMapping("/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation){
        iPrimaryReservation.supprimerReservation(idReservation);
    }
}

