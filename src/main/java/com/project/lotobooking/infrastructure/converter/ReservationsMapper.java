package com.project.lotobooking.infrastructure.converter;
import com.project.lotobooking.domain.model.Reservations;
import com.project.lotobooking.infrastructure.entity.ReservationsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", imports = {SallesMapper.class})
public interface ReservationsMapper {

    @Mapping(source = "idReservation", target = "id")
    Reservations toReservation(ReservationsEntity reservationsEntity);
    List<Reservations> toReservations(List<ReservationsEntity> reservationsEntity);

    @Mapping(source = "id", target = "idReservation")
    ReservationsEntity fromReservation(Reservations reservations);
    List<ReservationsEntity> fromReservation(List<Reservations> reservations);
}
