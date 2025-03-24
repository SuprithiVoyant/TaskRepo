package com.ivoyant.springBoot.repository;

import com.ivoyant.springBoot.dto.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {

}
