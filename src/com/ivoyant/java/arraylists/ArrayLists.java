package com.ivoyant.arraylists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayLists {

    static ArrayList<String> names = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addNames() {

        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<size; i++) {
            names.add(sc.nextLine());
        }
    }

    static void displayNames() {
        System.out.println("------------->");
        System.out.println("The names entered are : ");
        Iterator<String> iterator = names.iterator();
        while(((java.util.Iterator<?>) iterator).hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------->");
    }

    static void searchIndex(String name) {
        if(!names.isEmpty()) {
            if(names.contains(name)) {
                System.out.println("Index : "+names.indexOf(name));
            }else {
                System.out.println("Element is not present");
            }
        }else {
            System.out.println("The list is empty");
        }
    }

    static void searchName(int index) {
        if (!names.isEmpty()) {
            if (index >= 0 && index < names.size()) {
                System.out.println("Name : " + names.get(index));
            } else {
                System.out.println("Invalid index");
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    static void sortCollection() {
        System.out.println("Sorted order of the names : ");
        Collections.sort(names);
        displayNames();
    }

    public static void main(String[] args) {
        addNames();

        displayNames();

        System.out.println("Size of ArrayList -> "+names.size());

        sortCollection();

        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        searchIndex(name);
    }
}
