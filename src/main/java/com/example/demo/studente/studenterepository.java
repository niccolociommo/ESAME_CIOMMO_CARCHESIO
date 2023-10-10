package com.example.demo.studente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studenterepository extends JpaRepository<studente, Long> {
    void deleteById();
}
