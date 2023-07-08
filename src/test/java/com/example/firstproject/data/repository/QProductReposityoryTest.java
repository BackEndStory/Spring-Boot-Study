package com.example.firstproject.data.repository;


import com.example.firstproject.data.entiity.Product;
import com.example.firstproject.data.entiity.QProduct;
import com.querydsl.core.types.Predicate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
public class QProductReposityoryTest {

    @Autowired
    QProductRepository qProductRepository;


    @Test
    public void queryDslTest1(){

        Predicate predicate = (Predicate) QProduct.product.name.containsIgnoreCase("펜")
                .and(QProduct.product.price.between(1000,2500));

        Optional<Product> foundProduct = qProductRepository.findOne(predicate);

        if(foundProduct.isPresent()){
            Product product = foundProduct.get();
            System.out.println(product.getNumber());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getStock());
        }
    }

    @Test
    public void queryDSLTest2() {
        QProduct qProduct = QProduct.product;

        Iterable<Product> productList = qProductRepository.findAll(
                qProduct.name.contains("펜")
                        .and(qProduct.price.between(550, 1500))
        );

        for (Product product : productList) {
            System.out.println(product.getNumber());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getStock());
        }
    }



}
