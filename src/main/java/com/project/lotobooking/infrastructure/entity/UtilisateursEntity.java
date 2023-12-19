package com.project.lotobooking.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "utilisateurs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UtilisateursEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
}
