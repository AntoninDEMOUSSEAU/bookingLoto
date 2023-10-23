package com.project.lotoBooking.domain.model;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Evenements {
    private String id;
    private Date date;
    private Salles salle;
    private List<Reservations> reservation;

}
