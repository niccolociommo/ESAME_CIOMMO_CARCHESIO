package com.example.demo.orari.orariservice;

import com.example.demo.orari.orari;

import java.util.List;

public interface orariservice {
    orari createorari(orari orari);

    void deleteorari(Long id);

    List<orari> getAllorari();

    orari getorari(Long id);


}
