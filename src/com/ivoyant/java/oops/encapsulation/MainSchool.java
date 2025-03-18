package com.ivoyant.oops.encapsulation;

public class MainSchool {
    public static void main(String[] args) {
        School school1 = new School(1,"Ram");
        School school2 = new School(2,"sham");
        School school3 = new School(3,"dam");
        School school4 = new School(4,"Ram");

        School[] s = {school1, school2, school3, school4};

        //Updating the name
        school2.setName("superman");

        for(Object obj : s) {
            System.out.println(obj);
        }
    }
}
