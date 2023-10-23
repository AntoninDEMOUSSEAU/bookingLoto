package com.project.lotobooking.domain.ports.primary;


import com.project.lotobooking.domain.model.Utilisateurs;
import com.project.lotobooking.domain.ports.secondary.IUtilisateur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UtilisateurManager  {

    //Utilisateur service??
    private final IUtilisateur utilisateurPort;

    public List<Utilisateurs> getAllUsers () {
        return utilisateurPort.getAllUsers();
    }

}
