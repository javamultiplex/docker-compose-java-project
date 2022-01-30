package com.javamultiplex;

import com.javamultiplex.model.Post;
import com.javamultiplex.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {

	@Autowired
	private BlogService blogService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final List<Post> posts = Arrays.asList(
				new Post("post1", "Hard work is key to success"),
				new Post("post2", "Tit for Tat"),
				new Post("post3","Honesty is the best policy"),
				new Post("post4", "Love is blind"));
		blogService.save(posts);
		log.info("Added default posts in DB");
	}
}
