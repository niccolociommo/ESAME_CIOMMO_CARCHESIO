package com.example.demo.presenza;

import com.example.demo.presenza.presenzaservice.presenzaservice
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class presenzacontroller {
    private final presenzaservice presenzaservice;

    public presenzacontroller(com.example.demo.presenza.presenzaservice.presenzaservice presenzaservice) {
        this.presenzaservice = presenzaservice;
    }

    @GetMapping("/presenza")
    public List<presenza> getallpresenza() {
        return presenzaservice.getallpresenza();
    }

    @GetMapping("/presenza/{id}")
    public getpresenza(@PathVariable Long id) {
        return presenzaservice.getpresenza(id);
    }

    @PostMapping("/presenza")
    public presenza createpresenza(@RequestBody presenza presenza) {
        return presenzaservice.createpresenza(presenza);
    }

    @PutMapping("/presenza/{id}")
    public presenza updatepresenza(@PathVariable Long id, @RequestBody presenza presenza) throws HttpServerErrorException {
        if (!Id.equals(presenza.getId())) {
            throw new HttpServerErrorException(BAD REQUEST, "id in path does not match id in presenza object")
        }
        return presenza
    }

    @DeleteMapping("/presenza/{id}")
    public void deletepresenza(@PathVariable Long id) {
        presenzaservice.deletepresenza(id);
    }
}
