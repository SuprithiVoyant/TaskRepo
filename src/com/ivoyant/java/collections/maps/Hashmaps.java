package com.ivoyant.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,12);
        map.put(2,23);
        map.put(3,32);

        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+"->");
            System.out.println(entry.getValue());
        }

        System.out.println("Get : "+map.get(2));
        System.out.println("Is empty : "+map.isEmpty());
        System.out.println("keys : "+map.keySet());
        System.out.println("Size : "+map.size());
        System.out.println("Values : "+map.values());
        System.out.println("Contains Key 2: " + map.containsKey(2));
        System.out.println("Contains Value 32: " + map.containsValue(32));

    }
}

//HashMap is a subclass of Map Interface.
//It stores data in key-value pairs.
//Keys must be unique, but values can be duplicate.
//It allows only one null key and multiple null values.
//Does not follow insertion order.
//It’s not an indexed type of collection.
//Best used when fast lookup and data mapping is required.
//Size increases by 50%, default capacity is 16 and load-factor is 75%.
