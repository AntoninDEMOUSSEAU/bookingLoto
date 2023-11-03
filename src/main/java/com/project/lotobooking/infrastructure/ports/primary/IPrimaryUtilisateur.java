package com.project.lotobooking.infrastructure.ports.primary;


import com.project.lotobooking.domain.model.Utilisateurs;

import java.util.List;

public interface IPrimaryUtilisateur {

    List<Utilisateurs> getAllUsers();

    Utilisateurs getUserById( Long idUtilisateur);

    Utilisateurs creerUtilisateur(Utilisateurs utilisateurs);

    Utilisateurs updateUtilisateur(Utilisateurs utilisateurs);

    void supprimerUtilisateur(Long idUtilisateur);

}
