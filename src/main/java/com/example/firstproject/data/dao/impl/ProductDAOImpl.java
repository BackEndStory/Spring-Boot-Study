package com.example.firstproject.data.dao.impl;

import com.example.firstproject.data.dao.ProductDAO;
import com.example.firstproject.data.entiity.Product;
import com.example.firstproject.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product insertProduct(Product product){
        Product savedProduct = productRepository.save(product);

        return savedProduct;
    }

    @Override
    public Product selectProduct(Long number) {
        Product selectdProduct = productRepository.getById(number);
        return selectdProduct;
    }

    @Override
    public Product updateProductName(Long number, String name) throws Exception {

        Optional<Product> selectdProduct = productRepository.findById(number);

        Product updateProduct;
        if(selectdProduct.isPresent()){
            Product product = selectdProduct.get();

            product.setName(name);
            product.setUpdateAt(LocalDateTime.now());

            updateProduct = productRepository.save(product);
        }else{
            throw new Exception();
        }

        return updateProduct;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {

        Optional<Product> selectProduct = productRepository.findById(number);

        if(selectProduct.isPresent()){
            Product product = selectProduct.get();
            productRepository.delete(product);
        }else{
            throw new Exception();
        }

    }


}
