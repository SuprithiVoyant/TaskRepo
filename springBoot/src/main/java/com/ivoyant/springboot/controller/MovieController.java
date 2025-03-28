package com.ivoyant.springboot.controller;

import com.ivoyant.springboot.dto.Movies;
import com.ivoyant.springboot.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.OnError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Movie Controller", description = "Manage movies API's")
public class MovieController {

    @Autowired
    MovieService service;

    @Operation(summary = "Get all the movies present in the Database")
    @GetMapping("/movies")
    public ResponseEntity<Object> fetchAll(){
        return service.fetchAll();
    }

    @Operation(summary = "Post a movie")
    @PostMapping("/movies")
    public ResponseEntity<Object> save(@RequestBody Movies movie){
        return service.save(movie);
    }

    @Operation(summary = "Search a movie by it's ID")
    @GetMapping("/movies/{id}")
    public ResponseEntity<Object> fetch(@PathVariable int id){
        return service.fetch(id);
    }

    @Operation(summary = "Search a movie by name")
    @GetMapping("/movies/name/{name}")
    public ResponseEntity<Object> fetch(@PathVariable String name){
        return service.fetchByName(name);
    }

//    @PostMapping("/movies/save")
//    public ResponseEntity<?> saveAll(@RequestBody List<Movies> movies){
//        return service.saveAll(movies);
//    }

    @Operation(summary = "Get a movie according to it's rating")
    @GetMapping("/movies/ratings/{rating}")
    public ResponseEntity<?> ratingRange(@PathVariable int rating){
        return service.ratingRange(rating);
    }

    @Operation(summary = "For updating")
    @PutMapping("/movies")
    public ResponseEntity<?> updateMovie(@RequestBody Movies movie){
        return service.update(movie);
    }

    @Operation(summary = "For upadting partially")
    @PatchMapping("/movies/{id}")
    public ResponseEntity<?> patchMovie(@PathVariable int id, @RequestBody Movies updatedMovie) {
        return service.patchMovie(id, updatedMovie);
    }

    @Operation(summary =  "For delete operation")
    @DeleteMapping("/movies/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable int id){
        return service.deleteMovie(id);
    }
}
