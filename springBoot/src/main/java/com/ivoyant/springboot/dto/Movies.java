package com.ivoyant.springboot.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
public class Movies {

    private int movie_id;
    @Setter
    private String name;
    @Setter
    private int year;
    @Setter
    private int rating;
    @Setter
    private String description;

    public void setMovieId(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getMovieId() {
        return movie_id;
    }
}
