package com.project.lotobooking.infrastructure.repositoy;

import com.project.lotobooking.infrastructure.entity.EvenementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementRepository extends JpaRepository<EvenementsEntity,Long> {
}
