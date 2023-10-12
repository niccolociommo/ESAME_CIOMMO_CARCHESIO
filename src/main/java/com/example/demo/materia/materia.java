package com.example.demo.materia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class materia {
    @Id
    @GeneratedValue

    private Long id;

    private String nomemateria;
}
