package com.ivoyant.oops.inheritance;

class Human{
    void walks(){
        System.out.println("Walks daily for good health");
    }
}

class Boy extends Human{
    void eats(){
        System.out.println("Eats fruits for good health");
    }
}

class Adult extends Boy{
    void workout(){
        System.out.println("Works out every day");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Adult a = new Adult();
        a.workout();
        a.eats();
        a.walks();
    }
}

// A class inheriting from one parent class and that parent class inherits from it's parent's class can be called as Multi-level Inheritance