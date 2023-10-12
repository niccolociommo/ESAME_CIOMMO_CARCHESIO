package com.example.demo.presenza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface presenzarepository extends JpaRepository<presenza, Long> {
}
