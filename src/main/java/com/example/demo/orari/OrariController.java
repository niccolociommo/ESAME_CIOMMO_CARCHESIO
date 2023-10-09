package com.example.demo.orari;

import com.example.demo.orari.orari_service.OrariService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orari") // Definisco il prefisso delle route

public class OrariController {
    private final OrariService orariService;

    public OrariController(OrariService orariService) {
        this.orariService = orariService;
    }

    @GetMapping("/all") // Aggiungo "/all" per rendere la route univoca e descrittiva
    public List<Orari> getAllOrari() {
        return orariService.getAllOrari(); // Cambio il nome del metodo e della variabile per seguirne la convenzione
    }

    @GetMapping("/{id}")
    public Orari getOrari(@PathVariable Long id) {
        return orariService.getOrari(id); // Aggiungo il punto e virgola mancante
