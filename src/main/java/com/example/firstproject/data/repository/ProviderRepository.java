package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.Product;
import com.example.firstproject.data.entiity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
