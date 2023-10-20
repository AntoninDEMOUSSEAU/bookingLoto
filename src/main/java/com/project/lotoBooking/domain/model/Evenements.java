package com.project.lotoBooking.domain.model;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Evenements {
    private String id;
    public Date date;
    public Salles salle;
    public List<Reservations> Reservations;

}
