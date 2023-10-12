package com.example.demo.valutazione;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class valutazione {

    @Id
    @GeneratedValue

    private Long id;

    private String voto;
}
