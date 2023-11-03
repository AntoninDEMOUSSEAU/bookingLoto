package com.project.lotobooking.domain.services;

import com.project.lotobooking.domain.model.Salles;
import com.project.lotobooking.domain.ports.primary.IPrimarySalle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleService implements IPrimarySalle {

    IPrimarySalle iPrimarySalle;

    public SalleService( IPrimarySalle iPrimarySalle){
        this.iPrimarySalle = iPrimarySalle;
    }

    @Override
    public List<Salles> getAllSalle() {
        return iPrimarySalle.getAllSalle();
    }

    @Override
    public Salles getSalleById(Long idSalle) {
        return iPrimarySalle.getSalleById(idSalle);
    }

    @Override
    public Salles creerSalle(Salles salles) {
        return iPrimarySalle.creerSalle(salles);
    }

    @Override
    public void supprimerSalle(Long idSalle) {
        iPrimarySalle.supprimerSalle(idSalle);
    }
}
