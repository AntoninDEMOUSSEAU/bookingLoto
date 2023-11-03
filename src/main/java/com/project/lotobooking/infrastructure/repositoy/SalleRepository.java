package com.project.lotobooking.infrastructure.repositoy;

import com.project.lotobooking.infrastructure.entity.SallesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<SallesEntity,Long> {
}
