package com.ivoyant.springboot.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie_data")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;
    @Column(unique = true)
    private String name;
    private int year;
    private int rating;
    @Column(length = 1000)
    private String description;

}
