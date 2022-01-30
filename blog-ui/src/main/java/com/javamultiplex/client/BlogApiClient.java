package com.javamultiplex.client;

import com.javamultiplex.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Rohit Agarwal on 30/01/22 5:53 PM
 * @copyright www.javamultiplex.com
 */

@Component
public class BlogApiClient {
    private final RestTemplate restTemplate;

    @Value("${BLOG_API_URL}")
    private String url;

    @Autowired
    public BlogApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Post> getAllPosts() {
        return restTemplate
                .exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Post>>() {})
                .getBody();
    }
}
