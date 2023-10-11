package com.example.demo.studente;

import com.example.demo.studente.studente_service.studenteservice;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController

public class studentecontroller {
    private final studenteservice studenteservice;

    public studentecontroller(studenteservice studenteservice){
        this.studenteservice = studenteservice;
    }

    @GetMapping("/studente")
    public List<studente> getallstudente() {
        return studenteservice.getAllstudente();
    }

    @GetMapping("/studente/{id}")
    public studente getstudente(@PathVariable Long id) {
        return studenteservice.getstudente(id);

    }

    @PostMapping("/studente")
    public studente createstudente(@RequestBody studente studente) {
        return studenteservice.createstudente(studente);
    }

    @PutMapping("/studente/{id}")
    public studente updatestudente(@PathVariable Long id, @RequestBody studente studente) throws HttpServerErrorException {
        if (!id.equals(studente.getId())){
            throw new HttpServerErrorException(BAD_REQUEST, "id in path does not match id in studente object");
        }
        return studente;
    }

    @DeleteMapping("/studente/{id}")
    public void deleteorari(@PathVariable Long id) {
        studenteservice.deletestudente(id);
    }
}
