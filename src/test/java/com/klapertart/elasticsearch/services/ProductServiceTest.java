package com.klapertart.elasticsearch.services;

import com.klapertart.elasticsearch.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tritronik
 * @since 9/26/2024
 */

@SpringBootTest
@Slf4j
class ProductServiceTest {
    @Autowired
    private ProductService service;

    @Test
    void saveProduct() {
    }

    @Test
    void findAllProducts() {
        Iterable<Product> allProducts = service.findAllProducts();
        Assertions.assertNotNull(allProducts);

        for (Product product : allProducts) {
            log.info("Product: {}", product.toString());
        }

    }

    @Test
    void findProductById() {
    }
}