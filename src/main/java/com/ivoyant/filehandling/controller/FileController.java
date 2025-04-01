package com.ivoyant.filehandling.controller;

import com.ivoyant.filehandling.repository.StorageRepo;
import com.ivoyant.filehandling.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileController {

    @Autowired
    private StorageService service;

    @Autowired
    private StorageRepo repository;


    @PostMapping("/image")
    public ResponseEntity<?> uploadImage(@RequestParam("image")MultipartFile file) throws IOException {
        String uploadImage = service.uploadImage(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
    }

    @GetMapping("/image/{fileName}")
    public ResponseEntity<?> downloadImage(@PathVariable String fileName){
        byte[] imageData = service.downloadImage(fileName);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(imageData);
    }

    @DeleteMapping("/images/{id}")
    public ResponseEntity<?> deleteImage(@PathVariable int id){
        repository.deleteById((long) id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }

    @PostMapping("/image/FS")
    public ResponseEntity<?> uploadImageFS(@RequestParam("image")MultipartFile file) throws IOException {
        String uploadImage = service.uploadImageFS(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
    }

    @GetMapping("/image/FS/{fileName}")
    public ResponseEntity<?> downloadImageFS(@PathVariable String fileName){
        byte[] imageData = service.downloadFileFS(fileName);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(imageData);
    }
}
