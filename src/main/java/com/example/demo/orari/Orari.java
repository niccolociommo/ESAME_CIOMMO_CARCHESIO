package com.example.demo.orari;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter

public class Orari {
    @Id
    @GeneratedValue

    private Long id;
    private String Giorno;
    private String Orainizio;
    private String Orafine;



}
