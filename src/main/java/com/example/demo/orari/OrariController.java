package com.example.demo.orari;

import com.example.demo.orari.orari_service.OrariService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController

public class OrariController {
    private final OrariService OrariService;


    public OrariController(com.example.demo.orari.orari_service.OrariService orariService) {
        this.OrariService = orariService;
    }

    @GetMapping("/Orari")
    public List<Orari> getallOrari(){
        return OrariService.getallOrari();
    }

    @GetMapping("/orari/{id}")
    public Orari getOrari(@PathVariable Long id){
        return OrariService.getOrari(id)
    }

    PostMapping("Orari")
    Public Orari createOrari()
}
