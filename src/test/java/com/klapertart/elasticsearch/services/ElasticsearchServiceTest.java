package com.klapertart.elasticsearch.services;

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
        service.getProductDoc("1");
    }
}