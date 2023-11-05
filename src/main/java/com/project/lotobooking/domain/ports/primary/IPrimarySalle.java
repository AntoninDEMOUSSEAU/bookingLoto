package com.project.lotobooking.domain.ports.primary;
import com.project.lotobooking.domain.model.Salles;
import java.util.List;

public interface IPrimarySalle {

    List<Salles> getAllSalle();

    Salles getSalleById(Long idSalle);

    Salles creerSalle(Salles salles);

    void supprimerSalle(Long idSalle);
}
