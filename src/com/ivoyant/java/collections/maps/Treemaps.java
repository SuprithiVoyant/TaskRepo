package com.ivoyant.collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemaps {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 12);
        map.put(2, 23);
        map.put(3, 32);

        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "->");
            System.out.println(entry.getValue());
        }

        System.out.println("Get : " + map.get(2));
        System.out.println("Is empty : " + map.isEmpty());
        System.out.println("Keys : " + map.keySet());
        System.out.println("Size : " + map.size());
        System.out.println("Values : " + map.values());
        System.out.println("Contains Key 2: " + map.containsKey(2));
        System.out.println("Contains Value 32: " + map.containsValue(32));
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}

//It does not allow duplicate keys.
//It allows only 1 null value but does not allow null key.
//Stores entries in sorted (ascending) order based on keys.
//It is not indexed type of collection.
//Best used when sorting of keys is required along with key-value pairs.
//Performance is slower compared to HashMap due to sorting overhead.
//Default sorting is based on natural ordering.