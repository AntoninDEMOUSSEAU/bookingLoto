package com.project.lotobooking.infrastructure.ports.primary;

import com.project.lotobooking.domain.model.Evenements;


import java.util.List;

public interface IPrimaryEvenement {

    List<Evenements> getAllEvent();

    Evenements getEventById( Long idEvenement);

    Evenements creerEvenement(Evenements evenements);

    void supprimerEvenement(Long idEvenement);
}
