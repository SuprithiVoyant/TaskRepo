package com.ivoyant.strings;

public class UsingStringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        //Important methods in string buffer.
        System.out.println("append: " + sb.append(" Programming"));
        System.out.println("insert: " + sb.insert(5, "Language "));
        System.out.println("replace: " + sb.replace(5, 13, "Core "));
        System.out.println("delete: " + sb.delete(5, 10));
        System.out.println("reverse: " + sb.reverse());
        System.out.println("Length of buffer: " + sb.length());
        System.out.println("Capacity of buffer: " + sb.capacity());
    }
}
