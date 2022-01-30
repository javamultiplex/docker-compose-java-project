package com.javamultiplex.controller;

import com.javamultiplex.model.Post;
import com.javamultiplex.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rohit Agarwal on 22/01/22 10:31 PM
 * @copyright www.javamultiplex.com
 */
@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return blogService.getAllPosts();
    }
}
