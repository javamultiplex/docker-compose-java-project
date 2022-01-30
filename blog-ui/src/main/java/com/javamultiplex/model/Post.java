package com.javamultiplex.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Rohit Agarwal on 22/01/22 10:16 PM
 * @copyright www.javamultiplex.com
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Long id;
    private String title;
    private String description;
}
