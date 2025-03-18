package com.ivoyant.strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //Creation of string objects without new keyword.
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println((s1 == s2)); //compares addresses
        System.out.println(s1.equals(s2)); //compares values

        //Creating strings using new keyword.
        String s3 = new String("Hello world");
        String s4 = new String("Hello world");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println();

        //Important string methods.
        System.out.println("Size : "+s1.length()); //gives us the length of the string
        System.out.println("Characters : "+Arrays.toString(s1.getBytes())); //gets us the ASCII values
        System.out.println("Lowercase : "+s1.toLowerCase());
        System.out.println("Uppercase : "+s1.toUpperCase());
        System.out.println("Index of : "+s1.indexOf('o'));
        System.out.println("Last Index of : "+s1.lastIndexOf('o'));
        System.out.println("Repeat : "+s1.repeat(3));
        System.out.println("Substring : "+s1.substring(2));
        System.out.println("CharAT : "+s1.charAt(3));
        System.out.println("isBlank : "+s1.isBlank());
        System.out.println("isEmpty : "+s1.isEmpty());
        System.out.println("Concat : "+s1.concat(" world"));
        System.out.println("HashCode : "+s1.hashCode());
    }
}
