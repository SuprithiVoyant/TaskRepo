package com.ivoyant.oops.inheritance;

class Animal{
    void sleeps(){
        System.out.println("Sleeps");
    }
}

class Cat extends Animal{
    void eats(){
        System.out.println("Eats");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sleeps();
        c.eats();
    }
}

//A class inheriting the properties from it's superclass can be called as Single level inheritance