package com.klapertart.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class SampleSpringbootElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbootElasticsearchApplication.class, args);
	}

}
