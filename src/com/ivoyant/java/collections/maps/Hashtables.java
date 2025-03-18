package com.ivoyant.collections.maps;

import java.util.Hashtable;

public class Hashtables {
    public static void main(String[] args) {
        Hashtable<Integer,String> names = new Hashtable<>();
        names.put(1, "Ram");
        names.put(2, "Sham");
        names.put(3, "Suresh");
        names.put(4, "Ramesh");

        System.out.println("Hashtable : " + names);
        System.out.println("Value at key : " + names.get(2));
        System.out.println("Contains key : " + names.containsKey(3));
        System.out.println("Contains value : " + names.containsValue("Ram"));
        names.remove(4);
        System.out.println("After removing key 4 : " + names);
        System.out.println("Keys : " + names.keySet());
        System.out.println("Values : " + names.values());
        System.out.println("Size : " + names.size());

        for (Integer key : names.keySet()) {
            System.out.println("Key: " + key + ", Value: " + names.get(key));
        }
    }
}
