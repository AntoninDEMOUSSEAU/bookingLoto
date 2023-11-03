package com.project.lotobooking.infrastructure.adapters;

import com.project.lotobooking.domain.model.Salles;
import com.project.lotobooking.domain.ports.secondary.ISalle;
import com.project.lotobooking.infrastructure.converter.SallesMapper;
import com.project.lotobooking.infrastructure.repositoy.SalleRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class SalleAdapter implements ISalle {

    SallesMapper sallesMapper;
    SalleRepository salleRepository;

    @Override
    public List<Salles> getAllSalle() {
        return sallesMapper.toSalles(salleRepository.findAll());
    }

    @Override
    public Salles getSalleById(Long idSalle) {
        return salleRepository.findAll()
                .stream()
                .filter(salles -> Objects.equals(salles.getIdSalle(),idSalle))
                .findFirst()
                .map(sallesMapper::toSalle)
                .orElse(null);
    }

    @Override
    public Salles creerSalle(Salles salles) {
        return sallesMapper.toSalle(salleRepository.save(sallesMapper.fromSalle(salles))) ;
    }

    @Override
    public void supprimerSalle(Long idSalle) {
        salleRepository.deleteById(idSalle);
    }
}
