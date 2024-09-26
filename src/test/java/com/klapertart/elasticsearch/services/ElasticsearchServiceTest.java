package com.klapertart.elasticsearch.services;

import com.klapertart.elasticsearch.model.ProductDocResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author tritronik
 * @since 9/26/2024
 */

@SpringBootTest
class ElasticsearchServiceTest {

    @Autowired
    private ElasticsearchService service;

    @Test
    void testGetProduct() {
        ProductDocResponse.Product productDoc = service.getProductDoc("1");
        Assertions.assertNotNull(productDoc);
    }
}