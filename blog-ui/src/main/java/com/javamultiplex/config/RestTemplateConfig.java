package com.javamultiplex.config;

import com.javamultiplex.handler.RestTemplateErrorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Rohit Agarwal on 30/01/22 6:06 PM
 * @copyright www.javamultiplex.com
 */
@Configuration
public class RestTemplateConfig {

    private final RestTemplateErrorHandler restTemplateErrorHandler;

    @Autowired
    public RestTemplateConfig(RestTemplateErrorHandler restTemplateErrorHandler) {
        this.restTemplateErrorHandler = restTemplateErrorHandler;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .errorHandler(restTemplateErrorHandler)
                .build();
    }
}
