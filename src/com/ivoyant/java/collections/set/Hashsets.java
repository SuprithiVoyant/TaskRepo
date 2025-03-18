package com.ivoyant.collections.set;

import java.util.HashSet;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("hello");
        set.add(null);
        set.add(23);
        set.add(45);

        System.out.println("HashSet : " + set);
        System.out.println("Contains : " + set.contains(23));
        System.out.println("Remove : " + set.remove("hello"));
        System.out.println("is empty " + set.isEmpty());
        System.out.println("Size : " + set.size());
        System.out.println("HashCode : " + set.hashCode());

        Object[] arr = set.toArray();
        System.out.print("Elements using toArray(): ");
        for (Object ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        HashSet<Object> set2 = new HashSet<>();
        set2.add(45);
        set2.add("new");

        System.out.println("Another Set: " + set2);
        set.addAll(set2);
        System.out.println("After addAll: " + set);
        set.retainAll(set2);
        System.out.println("After retainAll: " + set);
        set.removeAll(set2);
        System.out.println("After removeAll: " + set);
    }
}

//HashSet is a subclass of Set Interface.
//It do not allow duplicates.
//It allows only 1 null.
//Most common method used for remove duplicates
//Do not follow insertion order.
//It's not indexed type of collection.
//Best used whn performance is needed and to avoid duplicates.
//size increase by 50%, default capacity is 16 and load-factor is 75%.