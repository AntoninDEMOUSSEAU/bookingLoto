package com.project.lotobooking.domain.ports.primary;


import com.project.lotobooking.domain.model.Utilisateurs;

import java.util.List;

public interface IPrimaryUtilisateur {

    List<Utilisateurs> getAllUsers();

    Utilisateurs getUserById( Long idUtilisateur);

    Utilisateurs supprimerUtilisateur(Long idUtilisateur);

}
