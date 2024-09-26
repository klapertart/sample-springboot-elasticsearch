package com.klapertart.elasticsearch.services;

import com.klapertart.elasticsearch.model.ProductDocResponse;
import com.klapertart.elasticsearch.repositories.ElasticsearchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.Objects;

/**
 * @author tritr
 * @since 11/16/2023
 */

@Component
@Slf4j
public class ElasticsearchService {
    private final Retrofit retrofit;

    public ElasticsearchService(Retrofit retrofit){
        this.retrofit = retrofit;
    }

    public ProductDocResponse.Product getProductDoc(String id){
        ProductDocResponse.Product product = null;

        try{
            // set call api service
            ElasticsearchRepository elasticsearchRepository = retrofit.create(ElasticsearchRepository.class);
            Call<ProductDocResponse> getProductById = elasticsearchRepository.getProductsById(id);

            Response<ProductDocResponse> response = getProductById.execute();

            if (response.isSuccessful()){
                ProductDocResponse body = response.body();
                product = Objects.nonNull(body) && Objects.nonNull(body.get_source()) ? body.get_source() : null;
                log.info("Request product success");
            }else {
                log.warn("Request product failed");
            }
        }catch (IOException e){
            log.warn("Runtime Exception: {}", e.getMessage());
        }

        return product;
    }
}
