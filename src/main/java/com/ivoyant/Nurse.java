package com.ivoyant;

import org.springframework.stereotype.Component;

import javax.print.Doc;

@Component("nurse")
public class Nurse implements Staff {

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void qualification() {
        System.out.println("Qualification : Pharma");
    }

    @Override
    public void assist() {
        System.out.println("Nurse is assisting!");
    }
}
