package com.project.lotoBooking.domain.ports.primary;


import com.project.lotoBooking.domain.model.Utilisateurs;
import com.project.lotoBooking.domain.ports.secondary.IUtilisateur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UtilisateurManager  {

    private final IUtilisateur utilisateurPort;

    public Utilisateurs chercherUtilisateur (Utilisateurs utilisateur) {
        return utilisateurPort.chercherUtilisateur(utilisateur);
    }

}
