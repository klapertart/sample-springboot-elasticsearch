package com.klapertart.elasticsearch.services;

import com.klapertart.elasticsearch.model.ProductDocResponse;
import com.klapertart.elasticsearch.properties.ElasticsearchProperty;
import com.klapertart.elasticsearch.repositories.ElasticsearchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

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

    public void getProductDoc(String id){
        try{
            // set call api service
            ElasticsearchRepository elasticsearchRepository = retrofit.create(ElasticsearchRepository.class);
            Call<ProductDocResponse> getProductById = elasticsearchRepository.getProductsById(id);

            Response<ProductDocResponse> response = getProductById.execute();

            if (response.isSuccessful()){
                ProductDocResponse body = response.body();
                log.info("Request Success, data : {} ", body.toString());
            }else {
                throw new RuntimeException("get product failed");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
