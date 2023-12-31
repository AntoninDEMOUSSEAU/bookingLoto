package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.infrastructure.entity.EvenementsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EvenementMapper {
    @Mapping(source = "idEvenement", target = "id")
    @Mapping(source = "reservations", target = "reservation")
    Evenements toEvenement(EvenementsEntity evenementsEntity);
    List<Evenements> toEvenements(List<EvenementsEntity> evenementsEntity);

    @Mapping(source = "id", target = "idEvenement")
    @Mapping(source = "reservation", target = "reservations")
    EvenementsEntity fromEvenement(Evenements evenements);
    List<EvenementsEntity> fromEvenements(List<Evenements> evenements);
}
