package com.example.demo.studente.studente_service;

import com.example.demo.studente.studente;
import com.example.demo.studente.studenterepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studenteserviceimpl implements studenteservice{

    private final studenterepository studenterepository;

    public studenteserviceimpl(com.example.demo.studente.studenterepository studenterepository) {
        this.studenterepository = studenterepository;
    }

    @Override
    public studente createstudente(studente studente) {
        return studenterepository.save(studente);
    }

    @Override
    public void deletestudente(Long id) {
        studenterepository.deleteById();

    }

    @Override
    public List<studenteservice> getAllstudente() {
        return studenterepository.findAll();
    }

    @Override
    public studente getstudente(Long id) {
        return studenterepository.findById(id).orElseThrow();
    }
}
