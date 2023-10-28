package com.project.lotobooking.infrastructure.converter;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.infrastructure.entity.EvenementsEntity;

public class EvenementsConverter {

    public static Evenements fromEntity(EvenementsEntity evt){
        Evenements evenements = Evenements.builder()
                .id(evt.getIdEvenement())
                .date(evt.getDate())
                .salle()
                .reservation()
                .build();
        return evenements;

   // public static EvenementsEntity fromModel(){
   //         return
   //     }


    }
}
