package com.ivoyant.strings;

public class UsingStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        //Important methods in StringBuilder
        System.out.println("append: " + sb.append(" Programming"));
        System.out.println("insert: " + sb.insert(5, "Language "));
        System.out.println("replace: " + sb.replace(5, 13, "Core "));
        System.out.println("delete: " + sb.delete(5, 10));
        System.out.println("After reverse: " + sb.reverse());
        System.out.println("Length of buffer: " + sb.length());
        System.out.println("Capacity of buffer: " + sb.capacity());
        System.out.println("Character at index 5: " + sb.charAt(5));

    }

}
