package com.example.demo.orari.orari_service;

import com.example.demo.orari.Orari;
import com.example.demo.orari.OrariRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrariServiceImpl implements OrariService {

    private final OrariRepository orariRepository;

    this.OrariRepository = orarirepository;

    public OrariRepository getOrariRepository() {
        return orariRepository;
    }

    @Override
    public Orari updateOrari(Orari orari) {
        return orariRepository.save(orari)
        return null;
    }

    @Override
    public void deleteOrari(Orari id) {
            orariRepository.deleteById(id);

    }

    @Override
    public List<Orari> getOrari() {
        return orariRepository.findAll()
        return null;
    }

    @Override
    public Orari getOrari(Long id) {
        return orariRepository.findById(id).orElseThrow();
        return null;
    }
}
