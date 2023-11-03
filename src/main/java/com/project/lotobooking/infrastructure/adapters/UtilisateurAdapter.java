package com.project.lotobooking.infrastructure.adapters;

import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.infrastructure.ports.secondary.IUtilisateur;
import com.project.lotobooking.infrastructure.converter.UtilisateurMapper;

import com.project.lotobooking.infrastructure.repositoy.UtilisateurRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;


@Component
public class UtilisateurAdapter implements IUtilisateur {

    UtilisateurMapper utilisateurMapper;
    private UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateurs> getAllUsers() {
       return utilisateurMapper.toUtilisateurs(utilisateurRepository.findAll());
    }

    @Override
    public Utilisateurs getUserById(Long idUtilisateur) {
        return utilisateurRepository.findAll().stream()
                .filter(utilisateurs1 -> Objects.equals(utilisateurs1.getId(), idUtilisateur))
                .findFirst()
                .map(utilisateurMapper::toUtilisateur)
                .orElse(null);
    }

    @Override
    public Utilisateurs enregistrerUtilisateur(Utilisateurs utilisateur) {


        return utilisateurMapper.toUtilisateur(utilisateurRepository.save(utilisateurMapper.fromUtilisateur(utilisateur)));
    }

    @Override
    public Utilisateurs mettreAJourUtilisateur(Utilisateurs utilisateur) {
        return null;
    }

    @Override
    public void supprimerUtilisateur(Long idUtilisateur) {
      utilisateurRepository.deleteById(idUtilisateur);
    }
}
