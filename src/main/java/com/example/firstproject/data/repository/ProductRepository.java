package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
