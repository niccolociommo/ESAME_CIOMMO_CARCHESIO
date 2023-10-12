package com.example.demo.valutazione;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface valutazionerepository extends JpaRepository <valutazione, long> {
}
