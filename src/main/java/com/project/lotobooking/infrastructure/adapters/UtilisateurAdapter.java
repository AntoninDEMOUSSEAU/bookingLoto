package com.project.lotobooking.infrastructure.adapters;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.domain.ports.secondary.IUtilisateur;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class UtilisateurAdapter implements IUtilisateur {

    private final List<Utilisateurs> utilisateurs =  List.of(
            new Utilisateurs(1L, "Demousseau", "Antonin", "anto.demouss@gmail.com", "0600000000"),
            new Utilisateurs(2L, "Brossard", "Rudy", "rudy.bro@gmail.com", "0600000000"));

    @Override
    public Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur) {
        return null;
    }

    @Override
    public List<Utilisateurs> getAllUsers() {
        //mapper.toUtilisateur(utiliateurEntity) pour faire le lien entre l'infra et le domain via les converter/mapper
        return utilisateurs;
    }

    @Override
    public Utilisateurs getUserById(Long idUtilisateur) {
        return utilisateurs.stream()
                .filter(utilisateurs1 -> Objects.equals(utilisateurs1.id(), idUtilisateur))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Utilisateurs mettreAJourUtilisateur(Utilisateurs utilisateur) {
        return null;
    }

    @Override
    public Utilisateurs supprimerUtilisateur(Utilisateurs utilisateur) {
        return null;
    }
}
