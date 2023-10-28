package com.project.lotobooking.infrastructure.entity;

import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.domain.model.Salles;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Internal;
import org.hibernate.annotations.Type;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "Evenements")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EvenementsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvenement;
    private Date date;
    @ManyToOne()
    private SallesEntity salles;
    @OneToMany(mappedBy = "idReservation")
    private List<ReservationsEntity> reservations;
}
