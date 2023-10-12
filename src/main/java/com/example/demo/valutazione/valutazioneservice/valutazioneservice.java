package com.example.demo.valutazione.valutazioneservice;

import com.example.demo.valutazione.valutazione;

import java.util.List;

public interface valutazioneservice {

    valutazione createvalutazione(valutazione valutazione);

    valutazione updatevalutazione(valutazione valutazione);

    void deletevalutazione(Long id);

    List<valutazione> getallvalutazione();

    valutazione getvalutazione(Long id);
}
