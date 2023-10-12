package com.example.demo.docente.docenteservice;

import com.example.demo.docente.docente;

import java.util.List;

public interface docenteservice {

    docente createdocente(docente docente);

    docente updatedocente(docente docente);

    void deletedocente(Long id);

    List<docente> getalldocente();

    docente getdocente(Long id);
}
