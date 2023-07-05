package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
