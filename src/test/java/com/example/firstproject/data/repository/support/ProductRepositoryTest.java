package com.example.firstproject.data.repository.support;

import com.example.firstproject.data.entiity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductReposityory productReposityory;

    @Test
    void findByNameTest(){
        List<Product> productList = productReposityory.findByName("펜");

        for(Product product : productList){
            System.out.println("Product Number : " + product.getNumber());
            System.out.println("Product Name : " + product.getName());
            System.out.println("Product Price : " + product.getPrice());
            System.out.println("Product Stock : " + product.getStock());
        }
    }
}
