package com.klapertart.elasticsearch.repositories;

import com.klapertart.elasticsearch.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tritronik
 * @since 9/26/2024
 */

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
}
