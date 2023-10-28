package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.infrastructure.entity.ReservationsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", imports = {SallesMapper.class})
public interface ReservationsMapper {

    @Mapping(source = "idReservation", target = "id")
    @Mapping(source = "idEvenement", target = "evenement.id")
    @Mapping(source = "idUtilisateur", target = "utilisateurs.id")
    Reservations toReservation(ReservationsEntity reservationsEntity);

    List<Reservations> toReservations(List<ReservationsEntity> reservationsEntity);
}
