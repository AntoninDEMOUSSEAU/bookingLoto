package com.project.lotoBooking.domain.ports.secondary;

import com.project.lotoBooking.domain.model.Utilisateurs;

public interface IUtilisateur {

    Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur);

    Utilisateurs chercherUtilisateur(Utilisateurs utilisateur);

    Utilisateurs mettreAJourUtilisateur(Utilisateurs utilisateur);

    Utilisateurs supprimerUtilisateur(Utilisateurs utilisateur);
}
