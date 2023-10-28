package com.project.lotobooking.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Salles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SallesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomSalle;
    private String adresseSalle;
    private Integer capaciteAssis;
    private Integer capaciteDebout;
}
