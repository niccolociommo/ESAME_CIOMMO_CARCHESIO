package com.example.demo.corso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController

@Repository

public interface corsorepository extends JpaRepository <corso, Long>{
}
