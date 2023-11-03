package com.project.lotobooking.application.controller;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.infrastructure.ports.primary.IPrimaryUtilisateur;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    final IPrimaryUtilisateur iPrimaryUtilisateur;

    public UtilisateurController(IPrimaryUtilisateur iPrimaryUtilisateur) {
        this.iPrimaryUtilisateur = iPrimaryUtilisateur;
    }

    @GetMapping
    public List<Utilisateurs> getAllUsers() {
        return iPrimaryUtilisateur.getAllUsers();
    }

    @GetMapping("/{idUtilisateur}")
    // /utilisateur/1
    //l'annotation @PathVariable permet de faire le lien entre ma pathVariable ({idUtilisateur}) dans l'URL de mon @Get et ma variable idUtilisateur

    // /utilisateurs?prenom=Antonin
    // @RequestParam("prenom") String prenom
    public Utilisateurs getUserById(@PathVariable Long idUtilisateur){

        return iPrimaryUtilisateur.getUserById(idUtilisateur);
    }

    @PostMapping
    public Utilisateurs creerUtilisateur(Utilisateurs utilisateurs){
        return iPrimaryUtilisateur.creerUtilisateur(utilisateurs);

    }

    @DeleteMapping("/{idUtilisateur}")
    public void supprimerUtilisateur (@PathVariable Long idUtilisateur){

        iPrimaryUtilisateur.supprimerUtilisateur(idUtilisateur);
    }
}
