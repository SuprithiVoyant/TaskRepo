package com.ivoyant.oops.encapsulation;

public class School {
    private int id;
    private String name;

    //Constructors
    public School(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
