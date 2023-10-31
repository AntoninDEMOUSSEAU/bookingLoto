package com.project.lotobooking.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Reversations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ReservationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;

    @ManyToOne()
    private EvenementsEntity evenement;

    @ManyToOne()
    private UtilisateursEntity utilisateur;

    private Integer nbResa;
}
