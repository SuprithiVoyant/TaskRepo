package com.ivoyant.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(1,"Hello",3,2,4,true,4));
        System.out.println("ArrayList : "+list);

        for(Object obj : list){
            System.out.println(obj);
        }

        //ArrayList Methods
        list.add("Ram");
        System.out.println(list);

        list.add(2,"Inserted");
        System.out.println(list);

        System.out.println(list.contains(2));

        System.out.println(list.indexOf(true));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(true);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.toString());

        System.out.println(list.reversed());

        list.add(null);
        list.add(null);
        System.out.println(list);
    }
}

//ArrayList is a subclass of List Interface.
//Can hold heterogeneous type of data.
//Allows duplicates.
//Allows Nulls.
//Indexed type of collection.
//Follows order of insertion.
//Best used for fetching.
//Default capacity is 10, increases by 50%