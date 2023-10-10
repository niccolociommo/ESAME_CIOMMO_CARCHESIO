package com.example.demo.orari.orariservice;

import com.example.demo.orari.orari;
import com.example.demo.orari.orarirepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class orariserviceimpl implements orariservice{

    private final orarirepository orarirepository;

    public orariserviceimpl(com.example.demo.orari.orarirepository orarirepository) {
        this.orarirepository = orarirepository;
    }

    @Override
    public orari createorari(orari orari) {
        return orarirepository.save(orari);
    }

    @Override
    public void deleteorari(Long id) {
        orarirepository.deleteById(id);

    }

    @Override
    public List<orari> getAllorari() {
        return orarirepository.findAll();
    }

    @Override
    public orari getorari(Long id) {
        return orarirepository.findById(id).orElseThrow();
    }
}
