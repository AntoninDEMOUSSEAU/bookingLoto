package com.project.lotobooking.domain.services;
import com.project.lotobooking.domain.model.Salles;
import com.project.lotobooking.domain.ports.primary.IPrimarySalle;
import com.project.lotobooking.domain.ports.secondary.ISalle;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalleService implements IPrimarySalle {

    ISalle iSalle;

    public SalleService( ISalle iSalle){
        this.iSalle = iSalle;
    }

    @Override
    public List<Salles> getAllSalle() {
        return iSalle.getAllSalle();
    }

    @Override
    public Salles getSalleById(Long idSalle) {
        return iSalle.getSalleById(idSalle);
    }

    @Override
    public Salles creerSalle(Salles salles) {
        return iSalle.creerSalle(salles);
    }

    @Override
    public void supprimerSalle(Long idSalle) {
        iSalle.supprimerSalle(idSalle);
    }
}
