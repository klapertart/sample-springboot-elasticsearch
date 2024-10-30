package com.klapertart.elasticsearch.services;

import com.klapertart.elasticsearch.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
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
    @Disabled
    void saveProduct() {
        Product product = Product.builder()
                .id("5")
                .name("Indomie Goreng Sambal Ijo")
                .price(3000d)
                .build();

        Product saveProduct = service.saveProduct(product);

        Assertions.assertEquals(product.getName(), saveProduct.getName());
    }

    @Test
    @Disabled
    void findAllProducts() {
        Iterable<Product> allProducts = service.findAllProducts();
        Assertions.assertNotNull(allProducts);

        for (Product product : allProducts) {
            log.info("Product: {}", product.toString());
        }

    }

    @Test
    @Disabled
    void findProductById() {
        Product productById = service.findProductById("5");
        Assertions.assertNotNull(productById);
    }
}