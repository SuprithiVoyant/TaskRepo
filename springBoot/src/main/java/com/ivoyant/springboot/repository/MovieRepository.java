package com.ivoyant.springboot.repository;

import com.ivoyant.springboot.dto.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Movies> findAll() {
        String sql = "SELECT * FROM movie_data";
        return jdbcTemplate.query(sql, new MovieRowmapper());
    }

    public int save(Movies movie) {
        String sql = "INSERT INTO movie_data (movie_id, name, year, rating, description) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, movie.getMovieId(), movie.getName(), movie.getYear(), movie.getRating(), movie.getDescription());
    }

    public Movies findById(int id) {
        try {
            String sql = "SELECT * FROM movie_data WHERE movie_id = ?";
            return jdbcTemplate.queryForObject(sql, new MovieRowmapper(), id);
        } catch (DataAccessException e) {
            return null;
        }
    }

    public List<Movies> findByNameIgnoreCase(String name) {
        String sql = "SELECT * FROM movie_data WHERE LOWER(name) = LOWER(?)";
        return jdbcTemplate.query(sql, new MovieRowmapper(), name);
    }

    public List<Movies> findByRatingGreaterThan(int rating) {
        String sql = "SELECT * FROM movie_data WHERE rating > ?";
        return jdbcTemplate.query(sql, new MovieRowmapper(), rating);
    }

    public int update(Movies movie) {
        String sql = "UPDATE movie_data SET name = ?, year = ?, rating = ?, description = ? WHERE movie_id = ?";
        return jdbcTemplate.update(sql, movie.getName(), movie.getYear(), movie.getRating(), movie.getDescription(), movie.getMovieId());
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM movie_data WHERE movie_id = ?";
        jdbcTemplate.update(sql, id);
    }
}

