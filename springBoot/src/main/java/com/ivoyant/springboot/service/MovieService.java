package com.ivoyant.springboot.service;

import com.ivoyant.springboot.dto.Movies;
import com.ivoyant.springboot.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private static final Logger logger = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    MovieRepository repository;

    public ResponseEntity<Object> fetchAll() {
        HashMap<String, Object> map = new HashMap<>();
        List<Movies> movie = repository.findAll();
        if(movie.isEmpty()){
            map.put("Movies","Nothing to show");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }else{
            map.put("Movies",movie);
            return new ResponseEntity<>(map, HttpStatus.FOUND);
        }
    }

    public ResponseEntity<Object> save(Movies movie) {
        HashMap<String, Object> map = new HashMap<>();
        repository.save(movie);
        map.put("Message", "Saved");
        map.put("Movie",movie);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    public ResponseEntity<Object> fetch(int id) {
        Optional<Movies> movie = repository.findById(id);
        HashMap<String, Object> map = new HashMap<>();
        if(movie.isPresent()){
            map.put("Movie",movie);
            logger.info("Movie found");
            return new ResponseEntity<>(map, HttpStatus.CREATED);
        }else{
            map.put("Movie", "Not Found");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> fetchByName(String name) {
        Optional<Movies> movie = repository.findByName(name);
        HashMap<String, Object> map = new HashMap<>();
        if(movie.isPresent()){
            map.put("Movie",movie);
            return new ResponseEntity<>(map, HttpStatus.CREATED);
        }else{
            map.put("Movie", "Not Found");
            logger.info("Movie with that particular name is not present in the DB");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> saveAll(List<Movies> movies) {
        repository.saveAll(movies);
        HashMap<String,Object> map = new HashMap<>();
        map.put("Movies", movies);
        map.put("Message", "saved");
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
}

