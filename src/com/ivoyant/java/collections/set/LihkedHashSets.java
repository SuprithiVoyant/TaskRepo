package com.ivoyant.collections.set;

import java.util.LinkedHashSet;

public class LihkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Object> set = new LinkedHashSet<>();
        set.add(34);
        set.add("hello");
        set.add(90);
        set.add("world");
        set.add(null);

        System.out.println("LinkedHashSet: " + set);
        System.out.println("Contains 'hello'? " + set.contains("hello"));
        System.out.println("Remove 90: " + set.remove(90));
        System.out.println("Is empty? " + set.isEmpty());
        System.out.println("Size: " + set.size());
        System.out.println("HashCode: " + set.hashCode());

        Object[] arr = set.toArray();
        System.out.print("Elements using toArray(): ");
        for (Object ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        LinkedHashSet<Object> set2 = new LinkedHashSet<>();
        set2.add(34);
        set2.add("new");

        set.addAll(set2);
        System.out.println("After addAll: " + set);
        set.retainAll(set2);
        System.out.println("After removeAll: " + set);
    }
}
//LinkedHashSet is a subclass of Set Interface.
//It does not allow duplicates.
//Allows only one null element.
//Maintains insertion order.
//It's not an indexed type of collection.
//Best used when unique elements are needed with insertion order preserved.
//Internally uses HashTable + LinkedList for storage.
//Slightly slower than HashSet due to maintaining order.
