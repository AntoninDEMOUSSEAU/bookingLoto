package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.infrastructure.entity.UtilisateursEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {

    Utilisateurs toUtilisateur(UtilisateursEntity utilisateursEntity);
    List<Utilisateurs> toUtilisateurs(List<UtilisateursEntity> utilisateursEntity);

    UtilisateursEntity fromUtilisateur(Utilisateurs utilisateurs);
    List<UtilisateursEntity> fromUtilisateurs(List<Utilisateurs> utilisateurs);
}
