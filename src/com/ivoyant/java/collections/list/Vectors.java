package com.ivoyant.collections.list;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>(Arrays.asList(2,4,"hello"));
        System.out.println(vector);

        //Some methods in vector.
        vector.add("superman");
        System.out.println(vector);

        vector.add(2,"Inserted");
        System.out.println(vector);

        System.out.println(vector.capacity());

        System.out.println(vector.contains("hello"));

        System.out.println(vector.elements());

        System.out.println(vector.get(3));

        System.out.println(vector.size());

        System.out.println(vector.hashCode());

        System.out.println(vector.isEmpty());

        System.out.println(vector.indexOf("superman"));

        System.out.println(vector.remove("hello"));

        System.out.println(vector);
    }
}

//Vector is subclass of List interface.
//Allows duplicates.
//Allows nulls.
//Follows order or insertion.
//It's a legacy class.
//It has a child class that is stack class.
//It's synchronized.
//Default capacity is 10, increases by 100%