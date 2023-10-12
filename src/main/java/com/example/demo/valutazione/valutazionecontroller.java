package com.example.demo.valutazione;

import com.example.demo.valutazione.valutazioneservice.valutazioneservice;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class valutazionecontroller {

    private final valutazioneservice valutazioneservice;

    public valutazionecontroller(com.example.demo.valutazione.valutazioneservice.valutazioneservice valutazioneservice) {
        this.valutazioneservice = valutazioneservice;
    }

    @GetMapping("/valutazione")
    public List<valutazione> getallvalutazione() {
        return valutazioneservice.getallvalutazione();
    }

    @GetMapping("/valutazione/{id}")
    public valutazione getvalutazione(@PathVariable Long id) {
        return valutazioneservice.getvalutazione(id);
    }

    @PostMapping("/valutazione/{id}")
    public  valutazione createvalutazione(@RequestBody valutazione valutazione) {
        return valutazioneservice.createvalutazione(valutazione);
    }

    @PutMapping("/valutazione")
    public valutazione updatevalutazione(@PathVariable Long id, @RequestBody valutazione valutazione) throws HttpServerErrorException {
        if (!id.equals((valutazione.getId()))){
            throw new HttpServerErrorException(BAD REQUEST, "id in path does not match id in valutazione object")
        }
    }

    @DeleteMapping("/valutazione/{id}")
    public void deletevalutazione(@PathVariable Long id) {
        valutazioneservice.deletevalutazione(id);
    }
}
