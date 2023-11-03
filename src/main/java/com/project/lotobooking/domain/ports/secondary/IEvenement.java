package com.project.lotobooking.domain.ports.secondary;

import com.project.lotobooking.domain.model.Evenements;

import java.util.List;

public interface IEvenement {
    List<Evenements> getAllEvent();

    Evenements getEventById( Long idEvenement);

    Evenements creerEvenement(Evenements evenements);

    void supprimerEvenement(Long idEvenement);
}
