package com.example.demo.corso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter

public class corso {
    @Id
    @GeneratedValue

    private Long id;

    private String nomecorso;
}
