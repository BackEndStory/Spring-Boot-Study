package com.example.firstproject.data.repository.support;


import com.example.firstproject.data.entiity.Product;
import com.example.firstproject.data.entiity.QProduct;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryImpl extends QuerydslRepositorySupport implements ProductRepositoryCustom {


    public ProductRepositoryImpl(Class<?> domainClass) {
        super(Product.class);
    }

    @Override
    public List<Product> findByName(String name) {

        QProduct product = QProduct.product;

        List<Product> productList = from(product)
                .where(product.name.eq(name))
                .select(product)
                .fetch();
        return productList;
    }
}
