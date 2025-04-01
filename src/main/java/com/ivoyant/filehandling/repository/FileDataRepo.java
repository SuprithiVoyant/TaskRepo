package com.ivoyant.filehandling.repository;

import com.ivoyant.filehandling.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepo extends JpaRepository<FileData,Long> {
    Optional<FileData> findByName(String fileName);
}
