package com.javamultiplex.service;

import com.javamultiplex.model.Post;
import com.javamultiplex.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 22/01/22 10:20 PM
 * @copyright www.javamultiplex.com
 */
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        final Iterable<Post> all = blogRepository.findAll();
        all.forEach(posts::add);
        return posts;
    }

    public void save(List<Post> posts){
        blogRepository.saveAll(posts);
    }
}
