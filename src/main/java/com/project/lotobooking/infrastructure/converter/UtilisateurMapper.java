package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.infrastructure.entity.UtilisateursEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UtilisateurMapper {

    Utilisateurs toUtilisteur(UtilisateursEntity utilisateursEntity);

    UtilisateursEntity fromUtilisateur(Utilisateurs utilisateurs);
}
