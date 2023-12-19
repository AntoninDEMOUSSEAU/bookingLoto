package com.project.lotobooking.domain.services;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.domain.ports.primary.IPrimaryEvenement;
import com.project.lotobooking.domain.ports.secondary.IEvenement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService implements IPrimaryEvenement {

    IEvenement iEvenement;

    public EvenementService(IEvenement iEvenement){
        this.iEvenement=iEvenement;
    }

    @Override
    public List<Evenements> getAllEvent() {
        return iEvenement.getAllEvent();
    }

    @Override
    public Evenements getEventById(Long idEvenement) {
        return iEvenement.getEventById(idEvenement);
    }

    @Override
    public Evenements creerEvenement(Evenements evenements) {
        return iEvenement.creerEvenement(evenements);
    }

    @Override
    public void supprimerEvenement(Long idEvenement) {
        iEvenement.supprimerEvenement(idEvenement);
    }
}
