package com.example.demo.valutazione.valutazioneservice;

import com.example.demo.valutazione.valutazione;
import com.example.demo.valutazione.valutazionerepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class valutazioneserviceimpl implements valutazioneservice{

    private final valutazionerepository valutazionerepository;

    public valutazioneserviceimpl(valutazionerepository valutazionerepository) {
        this.valutazionerepository = valutazionerepository;
    }
    @Override
    public valutazione createvalutazione(valutazione valutazione) {
        return valutazionerepository.save(valutazione);
    }

    @Override
    public valutazione updatevalutazione(valutazione valutazione) {
        return valutazionerepository.save(valutazione);
    }

    @Override
    public void deletevalutazione(Long id) {
        valutazionerepository.deleteById(id);

    }

    @Override
    public List<valutazione> getallvalutazione() {
        return valutazionerepository.findAll();
    }

    @Override
    public valutazione getvalutazione(Long id) {
        return valutazionerepository.findById(id).orElseThrow();
    }
}
