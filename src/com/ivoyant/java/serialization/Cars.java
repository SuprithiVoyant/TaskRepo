package com.ivoyant.serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cars implements Serializable {
    private String name;
    private String color;
    private double price;
    private List<Cars> models = new ArrayList<>();


    public Cars(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public List<Cars> getModels() {
        return models;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", models=" + models +
                '}';
    }

    public void addCars(Cars car) {
        models.add(car);
    }
}

