package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {


    Optional<Product> findByNumber(Long number);
    List<Product> findAllBy(String name);
    Product queryByNumber(Long number);

    boolean existsByNumber(Long number);

    long countByName(String name);                          // 조회 쿼리 개수

    void deleteByNumber(Long number);

    long removeByName(String name);

    List<Product> findFirst5ByName(String name);

    List<Product> findTop10ByName(String name);

    Product findByNumberIs(Long number);

    Product findByNumberEquals(Long number);

    Product findByNumberIsNot(Long number);

    Product findByNumberNot(Long number);

    List<Product> findByUpdatedAtNull();

    Product findByNumberAndName(Long number, String name);

    Product findByNumberOrName(Long number, String name);

    List<Product> findByPriceGreaterThan(Long price);

    List<Product> findByPriceGreaterThanEqual(Long price);

    List<Product> findByPriceLessThanEqual(Long price);

    List<Product> findByPriceLessThan(Long price);

    List<Product> findByPriceBetween(Long price, Long highPrice);


    List<Product> findByNameLike(String name);

    List<Product> findByNameContains(String name);
    List<Product> findByNameContaining(String name);


    List<Product> findByNameStartsWith(String name);
    List<Product> findByNameStartingWith(String name);


    List<Product> findByNameEndsWith(String name);
    List<Product> findByNameEndingWith(String name);

    List<Product> findByNameOrderByNumberAsc(String name);

    List<Product> findByNameOrderByNumberDesc(String name);

    List<Product> findByNameOrderByPriceAscStockDesc(String name);













}
