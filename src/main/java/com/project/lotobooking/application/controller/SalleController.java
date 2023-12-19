package com.project.lotobooking.application.controller;
import com.project.lotobooking.domain.model.Salles;
import com.project.lotobooking.domain.ports.primary.IPrimarySalle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salles")
public class SalleController {

     final IPrimarySalle iPrimarySalle;

    public SalleController(IPrimarySalle iPrimarySalle) {
        this.iPrimarySalle = iPrimarySalle;
    }

    @GetMapping()
    public List<Salles> getAllSalle() {
        return iPrimarySalle.getAllSalle();
    }
    @GetMapping("/{idSalle}")
    public Salles getSalleById(@PathVariable Long idSalle){
        return iPrimarySalle.getSalleById(idSalle);
    }
    @PostMapping
    public Salles creerSalle(Salles salles){
        return iPrimarySalle.creerSalle(salles);
    }
    @DeleteMapping("/{idSalle}")
    public void supprimerSalle(@PathVariable Long idSalle){
        iPrimarySalle.supprimerSalle(idSalle);
    }
}

