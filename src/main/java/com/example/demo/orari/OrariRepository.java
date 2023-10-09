package com.example.demo.orari;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrariRepository extends JpaRepository<Orari, Long> {
}
