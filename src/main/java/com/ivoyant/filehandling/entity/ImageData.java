package com.ivoyant.filehandling.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    @Lob
    @Column(name="imageData",length = 1000)
    private byte[] imageData;
}
