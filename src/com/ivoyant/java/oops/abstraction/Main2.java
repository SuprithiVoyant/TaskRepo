package com.ivoyant.oops.abstraction;

//Using abstract classes
abstract class Animal {
    abstract void sleeps();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Elephant extends Animal {
    void Sound() {
        System.out.println("makes sounds");
    }

    @Override
    void sleeps() {
        System.out.println("sleeps for 10 hours");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.sleeps();
        e.Sound();
        e.eat();
    }
}
