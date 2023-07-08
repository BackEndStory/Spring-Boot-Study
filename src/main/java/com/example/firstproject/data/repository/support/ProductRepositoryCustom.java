package com.example.firstproject.data.repository.support;

import com.example.firstproject.data.entiity.Product;

import java.util.List;

public interface ProductRepositoryCustom {

    List<Product> findByName(String name);
}
