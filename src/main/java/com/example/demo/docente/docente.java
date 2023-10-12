package com.example.demo.docente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class docente {

    @Id
    @GeneratedValue

    private Long id;

    private String nome;

    private String cognome;
}
