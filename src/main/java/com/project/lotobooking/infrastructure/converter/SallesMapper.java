package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Salles;
import com.project.lotobooking.infrastructure.entity.SallesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SallesMapper {

    @Mapping(source = "idSalle", target = "id")
    Salles toSalle(SallesEntity sallesEntity);
    List<Salles> toSalles(List <SallesEntity> sallesEntity);
    @Mapping(source = "id", target = "idSalle")
    SallesEntity fromSalle(Salles salles);
    List<SallesEntity> fromSalles(List<Salles> salles);
}
