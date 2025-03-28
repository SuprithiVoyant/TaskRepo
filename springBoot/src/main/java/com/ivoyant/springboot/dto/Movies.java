package com.ivoyant.springboot.dto;


import lombok.Data;

@Data
public class Movies {

    private int movie_id;
    private String name;
    private int year;
    private int rating;
    private String description;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovieId(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMovieId() {
        return movie_id;
    }
}
