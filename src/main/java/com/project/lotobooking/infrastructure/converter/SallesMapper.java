package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Salles;
import com.project.lotobooking.infrastructure.entity.SallesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SallesMapper {

    @Mapping(source = "idSalle", target = "id")
    Salles toSalles(SallesEntity sallesEntity);

}
