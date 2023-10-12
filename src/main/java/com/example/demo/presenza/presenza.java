package com.example.demo.presenza;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class presenza {
    @Id
    @GeneratedValue

    private Long id;

    private String data;

    private String assente;
}
