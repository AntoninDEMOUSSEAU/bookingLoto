package com.project.lotobooking.infrastructure.entity;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.domain.model.Utilisateurs;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "Reversations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReservationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;

    private Long idEvenement;

    private Long idUtilisateur;

    private Integer nbResa;
}
