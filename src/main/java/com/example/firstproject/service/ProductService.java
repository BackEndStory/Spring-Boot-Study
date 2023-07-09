package com.example.firstproject.service;

import com.example.firstproject.data.dto.ProductDto;
import com.example.firstproject.data.dto.ProductResponseDto;
import org.springframework.stereotype.Component;



public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
