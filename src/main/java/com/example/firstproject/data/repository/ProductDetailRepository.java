package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
