package com.ivoyant.springboot.repository;

import com.ivoyant.springboot.dto.Movies;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowmapper implements RowMapper<Movies> {

    public Movies mapRow(ResultSet rs, int rowNum) throws SQLException {
        Movies movie = new Movies();
        movie.setMovieId(rs.getInt("movie_id"));
        movie.setName(rs.getString("name"));
        movie.setYear(rs.getInt("year"));
        movie.setRating(rs.getInt("rating"));
        movie.setDescription(rs.getString("description"));
        return movie;
    }
}
