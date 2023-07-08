package com.example.firstproject.data.repository.support;


import com.example.firstproject.data.entiity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepositorySupport")
public interface ProductReposityory extends JpaRepository<Product, Long>, ProductRepositoryCustom {
}
