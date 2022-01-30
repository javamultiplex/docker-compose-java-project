package com.javamultiplex.repository;

import com.javamultiplex.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rohit Agarwal on 22/01/22 10:15 PM
 * @copyright www.javamultiplex.com
 */
@Repository
public interface BlogRepository extends CrudRepository<Post, Long> {
}
