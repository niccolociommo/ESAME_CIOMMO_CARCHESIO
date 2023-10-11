package com.example.demo.corso;

import com.example.demo.corso.corsoservice.corsoservice;
import org.springframework.data.web.SortArgumentResolver;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class corsocontroller {
    private final corsoservice corsoservice;

    public corsocontroller(com.example.demo.corso.corsoservice.corsoservice corsoservice) {
        this.corsoservice = corsoservice;
    }

    @GetMapping("/corso")
    public List<corso> getallcorso() {
        return corsoservice.getAllcorso();
    }

    @GetMapping("/corso/{id}")
    public corso getcorso(@PathVariable Long id) {
        return corsoservice.getcorso(id);
    }

    @PostMapping(/corso)
    public corso createcorso(@RequestBody corso corso) {
        return corsoservice.createcorso(corso);
    }

    @PutMapping("/corso/{id}")
    public corso updatecorso(@PathVariable Long id, @RequestBody corso corso) throws HttpServerErrorException {
        if (!id.equals(corso.getId())) {
            throw new HttpServerErrorException(BAD REQUEST, "id in path does not match id in corso object")
        }
        return corso
    }

    @DeleteMapping("/corso/{id}")
    public void deletecorso(@PathVariable Long id) {
        corsoservice.deletecorso(id);
    }

}
