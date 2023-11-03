package com.project.lotobooking.application.controller;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.infrastructure.ports.primary.IPrimaryEvenement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

    final IPrimaryEvenement iPrimaryEvenement;

    public EvenementController(IPrimaryEvenement iPrimaryEvenement){
        this.iPrimaryEvenement = iPrimaryEvenement;
    }

    @GetMapping
    List<Evenements> getAllEvent(){
        return iPrimaryEvenement.getAllEvent();
    }

    @GetMapping("/{idEvenement}")
    Evenements getEventById(@PathVariable Long idEvenement){
        return iPrimaryEvenement.getEventById(idEvenement);
    }

    @PostMapping
    Evenements creerEvenement(Evenements evenements){
        return iPrimaryEvenement.creerEvenement(evenements);
    }

    @DeleteMapping("/{idEvenement}")
    void supprimerEvenement(@PathVariable Long idEvenement){
        iPrimaryEvenement.supprimerEvenement(idEvenement);
    }
}
