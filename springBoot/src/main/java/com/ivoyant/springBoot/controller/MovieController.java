package com.ivoyant.springBoot.controller;

import com.ivoyant.springBoot.dto.Movies;
import com.ivoyant.springBoot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("/test")
    public String home(){
        return "Movies";
    }

    @GetMapping("/movies")
    public ResponseEntity<Object> fetchAll(){
        return service.fetchAll();
    }

    @PostMapping("/movies")
    public ResponseEntity<Object> save(@RequestBody Movies movie){
        return service.save(movie);
    }

}
