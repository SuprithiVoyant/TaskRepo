package com.ivoyant;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void qualification() {
        System.out.println("Qualification : MBBS");
    }

    @Override
    public void assist() {
        System.out.println("Doctor is assisting!");
    }
}
