package com.javamultiplex.service;

import com.javamultiplex.client.BlogApiClient;
import com.javamultiplex.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rohit Agarwal on 30/01/22 6:03 PM
 * @copyright www.javamultiplex.com
 */
@Service
public class BlogApiService {

    private final BlogApiClient blogApiClient;

    @Autowired
    public BlogApiService(BlogApiClient blogApiClient) {
        this.blogApiClient = blogApiClient;
    }

    public List<Post> getAllPosts() {
        return blogApiClient.getAllPosts();
    }
}
