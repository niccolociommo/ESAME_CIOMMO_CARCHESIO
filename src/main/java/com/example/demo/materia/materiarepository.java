package com.example.demo.materia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface materiarepository extends JpaRepository <materia, Long> {
}
