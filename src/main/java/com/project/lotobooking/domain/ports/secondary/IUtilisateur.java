package com.project.lotobooking.domain.ports.secondary;

import com.project.lotobooking.domain.model.Utilisateurs;

import java.util.List;

public interface IUtilisateur {

    Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur);

    List<Utilisateurs> getAllUsers();

    Utilisateurs getUserById(Long idUtilisateur);

    Utilisateurs mettreAJourUtilisateur(Utilisateurs utilisateur);

    void supprimerUtilisateur(Long idUtilisateur);
}
