package com.ivoyant.filehandling.repository;

import com.ivoyant.filehandling.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StorageRepo extends JpaRepository<ImageData, Long> {

    Optional<ImageData> findByName(String fileName);
}
