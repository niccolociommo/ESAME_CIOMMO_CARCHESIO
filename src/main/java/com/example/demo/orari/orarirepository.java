package com.example.demo.orari;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository

public interface orarirepository extends JpaRepository <orari, Long>{
}
