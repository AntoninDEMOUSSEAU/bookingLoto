package com.project.lotobooking.infrastructure.repositoy;

import com.project.lotobooking.infrastructure.entity.ReservationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationsEntity, Long> {
}
