package com.ivoyant.springBoot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movies {

    @Id
    @GeneratedValue
    private int ID;
    private String name;
    private int year;
    private String desc;
    private int rating;

}
