package com.ivoyant.springboot.repository;

import com.ivoyant.springboot.dto.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {
    Optional<Movies> findByName(String name);
}

