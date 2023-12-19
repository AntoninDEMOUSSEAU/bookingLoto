package com.project.lotobooking.infrastructure.adapters;

import com.project.lotobooking.domain.model.Evenements;
import com.project.lotobooking.domain.ports.secondary.IEvenement;
import com.project.lotobooking.infrastructure.converter.EvenementMapper;
import com.project.lotobooking.infrastructure.repositoy.EvenementRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class EvenementAdapter implements IEvenement {

    EvenementMapper evenementMapper;
    EvenementRepository evenementRepository;

    @Override
    public List<Evenements> getAllEvent() {
        return evenementMapper.toEvenements(evenementRepository.findAll());
    }

    @Override
    public Evenements getEventById(Long idEvenement) {
        return evenementRepository.findAll()
                .stream()
                .filter(evenements -> Objects.equals(evenements.getIdEvenement(),idEvenement))
                .findFirst()
                .map(evenementMapper::toEvenement)
                .orElse(null);
    }

    @Override
    public Evenements creerEvenement(Evenements evenements) {
        return evenementMapper.toEvenement(evenementRepository.save(evenementMapper.fromEvenement(evenements)));
    }

    @Override
    public void supprimerEvenement(Long idEvenement) {
        evenementRepository.deleteById(idEvenement);

    }
}
