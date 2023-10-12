package com.example.demo.materia.materiaservice;

import com.example.demo.materia.materia;

import java.util.List;

public interface materiaservice {
    materia createmateria(materia materia);

    materia updatemateria(materia materia);

    void deletemateria(Long id);

    List<materia> getallmateria();

    materia getmateria(Long id);
}
