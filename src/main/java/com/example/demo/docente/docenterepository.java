package com.example.demo.docente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface docenterepository extends JpaRepository<docente, Long> {
}
