package com.klapertart.elasticsearch.services;

import com.klapertart.elasticsearch.model.Product;
import com.klapertart.elasticsearch.repositories.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * @author tritronik
 * @since 9/26/2024
 */

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Iterable<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Product findProductById(String id){
        return productRepository.findById(id).orElse(null);
    }
}
