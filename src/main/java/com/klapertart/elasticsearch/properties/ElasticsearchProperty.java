package com.klapertart.elasticsearch.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tritr
 * @since 11/16/2023
 */

@Component
@ConfigurationProperties("elk")
@Getter
@Setter
public class ElasticsearchProperty {
    private String apiUrl;
    private String username;
    private String password;
    private long timeout;
}
