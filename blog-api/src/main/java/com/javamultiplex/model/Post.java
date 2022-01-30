package com.javamultiplex.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Rohit Agarwal on 22/01/22 10:16 PM
 * @copyright www.javamultiplex.com
 */
@Entity
@Table
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    public Post(){

    }

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
