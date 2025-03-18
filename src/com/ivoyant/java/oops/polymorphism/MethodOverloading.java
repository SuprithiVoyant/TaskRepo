package com.ivoyant.oops.polymorphism;

class AddMe{
    String add(int a){
        return "Not possible to add";
    }
    String add(){
        return "Not possible to add";
    }
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        AddMe obj = new AddMe();
        System.out.println(obj.add());
        System.out.println(obj.add(2));
        System.out.println(obj.add(2,5));
        System.out.println(obj.add(5,6,7));
    }
}
