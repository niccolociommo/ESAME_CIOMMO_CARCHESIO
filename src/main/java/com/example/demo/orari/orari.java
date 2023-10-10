package com.example.demo.orari;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter

public class orari {
    @Id
    @GeneratedValue

    private Long id;

    private String nome;

    private String giorno;

    private String orainizio;

    private String orafine;


}
