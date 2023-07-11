package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
}
