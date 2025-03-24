package com.ivoyant.springBoot.service;

import com.ivoyant.springBoot.dto.Movies;
import com.ivoyant.springBoot.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository repository;

    HashMap<String, Object> map = new HashMap<>();

    public ResponseEntity<Object> fetchAll() {
        List<Movies> movie = repository.findAll();
        map.put("Movies",movie);
        return new ResponseEntity<>(map, HttpStatus.FOUND);
    }

    public ResponseEntity<Object> save(Movies movie) {
        repository.save(movie);
        map.put("Message", "Saved");
        map.put("Movie",movie);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
}
