package com.project.lotobooking.infrastructure.adapter;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.domain.ports.secondary.IUtilisateur;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurAdapter implements IUtilisateur {

    private final IUtilisateur utilisateurPort;

    public UtilisateurAdapter(IUtilisateur utilisateurPort) {
        this.utilisateurPort = utilisateurPort;
    }

    @GetMapping()
    public List<Utilisateurs> getAllUsers() {
        return utilisateurPort.getAllUsers();
    }

    @PostMapping
    public Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur) {
        return null;
    }

    @PutMapping
    public Utilisateurs mettreAJourUtilisateur(Utilisateurs utilisateur) {
        return null;
    }

    @DeleteMapping
    public Utilisateurs supprimerUtilisateur(Utilisateurs id) {
        return null;
    }
}
