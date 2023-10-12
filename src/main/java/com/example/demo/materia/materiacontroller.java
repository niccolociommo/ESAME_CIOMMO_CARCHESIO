package com.example.demo.materia;

import com.example.demo.materia.materiaservice.materiaservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class materiacontroller {
    private final materiaservice materiaservice;

    public materiacontroller(materiaservice materiaservice) {
        this.materiaservice = materiaservice;
    }

    @GetMapping("/materia")
    public List<materia> getallmateria() {
        return materiaservice.getallmateria();
    }

    @GetMapping("/materia/{id}")
    public materia getmateria(@PathVariable Long id) {
        return materiaservice.getmateria(id);
    }

    @PostMapping("/materia")
    public materia createmateria(@RequestBody materia materia) {
        return materiaservice.createmateria(materia);
    }

    @PutMapping("/materia/{id}")
    public materia updatemateria(@PathVariable Long id, @RequestBody materia materia) throws HttpServerErrorException {
        if (!id.equals((materia.getId()))){
            throw new HttpServerErrorException(BAD REQUEST, "id in path does not match id in materia object")
        }
        return materia;
    }

    @DeleteMapping("/materia/{id}")
    public void deletemateria(@PathVariable Long id) {
        materiaservice.deletemateria(id);
    }


}
