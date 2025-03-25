package com.ivoyant.springboot.controller;

import com.ivoyant.springboot.dto.Movies;
import com.ivoyant.springboot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("/movies")
    public ResponseEntity<Object> fetchAll(){
        return service.fetchAll();
    }

    @PostMapping("/movies")
    public ResponseEntity<Object> save(@RequestBody Movies movie){
        return service.save(movie);
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Object> fetch(@PathVariable int id){
        return service.fetch(id);
    }

    @GetMapping("/movies/name/{name}")
    public ResponseEntity<Object> fetch(@PathVariable String name){
        return service.fetchByName(name);
    }

    @PostMapping("/movies/save")
    public ResponseEntity<?> saveAll(@RequestBody List<Movies> movies){
        return service.saveAll(movies);
    }

}
