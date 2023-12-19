package com.project.lotobooking.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evenements")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EvenementsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvenement;
    private Date date;

    @JoinColumn(name="idSalle")
    @ManyToOne()
    private SallesEntity salles;

    @JoinColumn(name="idReservation")
    @OneToMany()
    private List<ReservationsEntity> reservations;
}
