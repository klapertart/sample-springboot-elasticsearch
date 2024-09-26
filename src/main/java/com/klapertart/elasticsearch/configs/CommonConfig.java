package com.klapertart.elasticsearch.configs;

import com.klapertart.elasticsearch.properties.ElasticsearchProperty;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.Duration;

/**
 * @author tritr
 * @since 11/16/2023
 */

@Configuration
public class CommonConfig {
    @Bean
    public Retrofit retrofit(ElasticsearchProperty elasticsearchProperty){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(Duration.ofSeconds(elasticsearchProperty.getTimeout()))
                .connectTimeout(Duration.ofSeconds(elasticsearchProperty.getTimeout()))
                .addInterceptor(loggingInterceptor).build();

        return new Retrofit.Builder()
                .baseUrl(elasticsearchProperty.getApiUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }
}
