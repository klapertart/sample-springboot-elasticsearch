package com.klapertart.elasticsearch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author tritronik
 * @since 9/26/2024
 */

// indexname using alias
@Document(indexName = "product")
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;
}
