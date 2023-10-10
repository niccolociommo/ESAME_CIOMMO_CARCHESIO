package com.example.demo.corso.corsoservice;

import com.example.demo.corso.corso;

import java.util.List;

public interface corsoservice {
    corso createcorso(corso corso);

    void deletecorso(Long id);

    List<corso> getAllcorso();

    corso getcorso (Long id);

}
