package com.example.demo.orari.orari_service;

import com.example.demo.orari.Orari;
import com.example.demo.orari.OrariRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrariServiceImpl implements OrariService {

    private final OrariRepository orariRepository;

    public OrariServiceImpl(OrariRepository orariRepository) {
        this.orariRepository = orariRepository;
    }

    @Override
    public Orari updateOrari(Orari orari) {
        return orariRepository.save(orari);
    }

    @Override
    public void deleteOrari(Long id) {
        orariRepository.deleteById(id);
    }

    @Override
    public List<Orari> getOrari() {
        return orariRepository.findAll();
    }

    @Override
    public Orari getOrari(Long id) {
        Optional<Orari> optionalOrari = orariRepository.findById(id);
        return optionalOrari.orElse(null); // Puoi gestire diversamente se l'elemento non viene trovato
    }
}
``

