package com.ivoyant.collections.list;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(7);
        list.add("hello");
        list.add(true);
        list.add(355.45);
        list.add(7);
        list.add(null);

        //Some methods in linked list.
        System.out.println(list);
        list.add(2,"Inserted");
        System.out.println(list.contains("Inserted"));
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getClass());
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.poll());
        list.push("pushed"); // adds for 1st element.
        System.out.println(list);
        System.out.println(list.hashCode());
    }
}

//Subclass of both Queue and List Interface.
//Size gets increased by 50%, default capacity is 10.
//Allows nulls.
//Allows duplicates.
//Indexed type of collection.
//Best option for insertion and deletion.
//Follows node structure.
