package com.klapertart.elasticsearch.repositories;

import com.klapertart.elasticsearch.model.ProductDocResponse;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * @author tritr
 * @since 11/16/2023
 */
public interface ElasticsearchRepository {
    @GET("/products/_doc/{id}")
    public Call<ProductDocResponse> getProductsById(@Path("id") String id);
}
