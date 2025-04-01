package com.ivoyant.filehandling.service;

import com.ivoyant.filehandling.entity.FileData;
import com.ivoyant.filehandling.entity.ImageData;
import com.ivoyant.filehandling.repository.FileDataRepo;
import com.ivoyant.filehandling.repository.StorageRepo;
import com.ivoyant.filehandling.util.Compressions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

@Service
public class StorageService {

    @Autowired
    private StorageRepo repository;

    @Autowired
    private FileDataRepo filerepo;

    private final String FOLDER_PATH = "C:/Users/SUPRITH/intellij/filehandling/src/main/resources/static/images";

    public String uploadImage(MultipartFile file) throws IOException {

        ImageData imageData = repository.save(ImageData.builder()
                                .name(file.getOriginalFilename())
                                .type(file.getContentType())
                                .imageData(Compressions.compressImage(file.getBytes()))
                                .build());
        if(imageData != null){
            return "File uploaded successfully : "+file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName){
        Optional<ImageData> dimage = repository.findByName(fileName);
        return Compressions.decompressImage(dimage.get().getImageData());
    }

    public String uploadImageFS(MultipartFile file) throws IOException {

        String filepath = FOLDER_PATH+file.getOriginalFilename();

        FileData fileData = filerepo.save(FileData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .filePath(filepath).build());

        file.transferTo(new File(filepath));

        if(fileData!=null){
            return "file uploaded successfully : "+file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadFileFS(String fileName) {
        Optional<FileData> filedata = filerepo.findByName(fileName);
        String filePath = filedata.get().getFilePath();
        byte[] image;
        try {
            image = Files.readAllBytes(new File(filePath).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }

}
