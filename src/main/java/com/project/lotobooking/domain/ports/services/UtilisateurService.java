package com.project.lotobooking.domain.ports.services;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.domain.ports.primary.IPrimaryUtilisateur;
import com.project.lotobooking.domain.ports.secondary.IUtilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService implements IPrimaryUtilisateur {


    final IUtilisateur iUtilisateur;

    public UtilisateurService(IUtilisateur iUtilisateur) {
        this.iUtilisateur = iUtilisateur;
    }

    public List<Utilisateurs> getAllUsers() {
        return iUtilisateur.getAllUsers();
    }

    @Override
    public Utilisateurs getUserById(Long idUtilisateur) {
        return iUtilisateur.getUserById(idUtilisateur);
    }

    @Override
    public Utilisateurs supprimerUtilisateur(Long id) {
        return iUtilisateur.supprimerUtilisateur(id);
    }
}
