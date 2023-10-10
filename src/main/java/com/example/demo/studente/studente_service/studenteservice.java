package com.example.demo.studente.studente_service;

import com.example.demo.studente.studente;

import java.util.List;

public interface studenteservice {
    studente createstudente(studente studente);

    void deletestudente(Long id);

    List<studente> getAllstudente();

    studente getstudente(Long id);


}

