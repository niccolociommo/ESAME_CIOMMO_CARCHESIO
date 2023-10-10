package com.example.demo.orari;

import com.example.demo.orari.orariservice.orariservice;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController

public class oraricontroller {
    private final orariservice orariservice;

    public oraricontroller(com.example.demo.orari.orariservice.orariservice orariservice) {
        this.orariservice = orariservice;
    }

    @GetMapping("/orari")
    public List<orari> getallorari(){
        return orariservice.getAllorari();
    }

    @GetMapping("/orari/{id}")
    public orari getorari(@PathVariable Long id){
        return orariservice.getorari(id);
    }

    @PostMapping("/orari")
    public orari createorari(@RequestBody orari orari){
        return orariservice.createorari(orari);
    }

    @PutMapping("/orari/{id}")
    public orari updateorari(@PathVariable Long id, @RequestBody orari orari) throws HttpServerErrorException {
        if (!id.equals(orari.getId())){
            throw new HttpServerErrorException(BAD_REQUEST, "id in path does not match id in animal object");
        }
        return orari;
    }

    @DeleteMapping("/orari/{id}")
    public void deleteorari(@PathVariable Long id) {
        orariservice.deleteorari(id);
    }

}
