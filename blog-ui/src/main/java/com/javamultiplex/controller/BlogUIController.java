package com.javamultiplex.controller;

import com.javamultiplex.model.Post;
import com.javamultiplex.service.BlogApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Rohit Agarwal on 26/01/22 9:22 PM
 * @copyright www.javamultiplex.com
 */
@Controller
public class BlogUIController {

    private final BlogApiService blogApiService;

    @Autowired
    public BlogUIController(BlogApiService blogApiService) {
        this.blogApiService = blogApiService;
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        final List<Post> posts = blogApiService.getAllPosts();
        model.addAttribute("posts", posts);
        return "posts";
    }

}
