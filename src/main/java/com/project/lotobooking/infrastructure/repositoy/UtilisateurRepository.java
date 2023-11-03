package com.project.lotobooking.infrastructure.repositoy;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.infrastructure.entity.UtilisateursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<UtilisateursEntity, Long> {

}

