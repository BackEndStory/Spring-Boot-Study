package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
