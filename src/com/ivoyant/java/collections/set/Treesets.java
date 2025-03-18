package com.ivoyant.collections.set;

import java.util.TreeSet;

public class Treesets {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(45);
        set.add(8);
        set.add(23);
        set.add(10);

        System.out.println("TreeSet: " + set);
        System.out.println("First Element : " + set.first());
        System.out.println("Last Element : " + set.last());
        System.out.println("Higher than 12 : " + set.higher(12));
        System.out.println("Lower than 12 : " + set.lower(12));
        System.out.println("SubSet : " + set.subSet(10, 45));
        System.out.println("Contains 23 : " + set.contains(23));
        System.out.println("Remove 45 : " + set.remove(45));
        System.out.println("Size : " + set.size());
        System.out.println("Is Empty : " + set.isEmpty());
        System.out.println("HashCode : " + set.hashCode());

        Object[] arr = set.toArray();
        System.out.print("Elements using toArray(): ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
//TreeSet is a subclass of Set Interface.
//It does not allow duplicates.
//Allows only one null element.
//Follows ascending order by default.
//It's not an indexed type of collection.
//Best used when sorted and unique elements are required.
//Internally uses TreeMap for storage (Red-Black Tree implementation).
//Slower than HashSet but provides sorted order.
