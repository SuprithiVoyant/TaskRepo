package com.ivoyant.springboot.service;

import com.ivoyant.springboot.dto.Movies;
import com.ivoyant.springboot.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Slf4j
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
            return new ResponseEntity<>(movie, HttpStatus.FOUND);
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
        Optional<Movies> movie = Optional.ofNullable(repository.findById(id));
        HashMap<String, Object> map = new HashMap<>();
        if(movie.isPresent()){
            logger.info("Movie found");
            return new ResponseEntity<>(movie, HttpStatus.CREATED);
        }else{
            map.put("Movie", "Not Found");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> fetchByName(String name) {
        List<Movies> movie = repository.findByNameIgnoreCase(name);
        HashMap<String, Object> map = new HashMap<>();
        if(movie.isEmpty()){
            map.put("Movie", "Not Found");
            logger.info("Movie with that particular name is not present in the DB");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }else{
            map.put("Movie",movie);
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
    }

//    public ResponseEntity<?> saveAll(List<Movies> movies) {
//        repository.saveAll(movies);
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("Movies", movies);
//        map.put("Message", "saved");
//        logger.info("All Movies Saved");
//        return new ResponseEntity<>(map, HttpStatus.CREATED);
//    }

    public ResponseEntity<?> ratingRange(int rating) {
        List<Movies> movies = repository.findByRatingGreaterThan(rating);
        if(!movies.isEmpty()){
            HashMap<String, Object> map = new HashMap<>();
            map.put("Message", "Found");
            map.put("Movie", movies);
            return new ResponseEntity<>(map, HttpStatus.FOUND);
        }else{
            HashMap<String, Object> map = new HashMap<>();
            map.put("Message", "Not Found");
            return new ResponseEntity<>(map, HttpStatus.FOUND);
        }
    }

    public ResponseEntity<?> update(Movies movie) {
        HashMap<String, Object> map = new HashMap<>();
        repository.save(movie);
        map.put("Message", "Updated");
        map.put("Movie",movie);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    public ResponseEntity<?> deleteMovie(int id) {
        HashMap<String, Object> map = new HashMap<>();

        // Check if the movie exists
        if (repository.findById(id) != null) {
            repository.deleteById(id);
            map.put("Message", "Movie deleted!");
            return new ResponseEntity<>(map, HttpStatus.OK);
        } else {
            map.put("Message", "No such movie found");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> patchMovie(int id, Movies updatedMovie) {
        Optional<Movies> optionalMovie = Optional.ofNullable(repository.findById(id));
        if (optionalMovie.isEmpty()) {
            return new ResponseEntity<>("Movie not found", HttpStatus.NOT_FOUND);
        }

        Movies movie = optionalMovie.get();

        if (updatedMovie.getName() != null) movie.setName(updatedMovie.getName());
        if (updatedMovie.getYear() != 0) movie.setYear(updatedMovie.getYear());
        if (updatedMovie.getDescription() != null) movie.setDescription(updatedMovie.getDescription());
        if (updatedMovie.getRating() != 0) movie.setRating(updatedMovie.getRating());

        repository.save(movie);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}

