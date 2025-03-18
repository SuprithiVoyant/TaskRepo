package com.ivoyant.oops.polymorphism;

class Mammal {
    void legs() {
        System.out.println(4);
    }
}

class Dog extends Mammal {
    void legs() {
        //Overriding the method legs() and giving different implementations.
        System.out.println("Cat : "+4);
        System.out.println("Dog : "+4);
    }
}

class Lamb extends Dog {
    void legs() {
        //super.Method() is used for getting the superclass implementations to the subclass
        super.legs();
        System.out.println("lamb : "+4);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        //Overriding for dog using mammal class
        Dog dog = new Dog();
        dog.legs();
        System.out.println("--->");

        //Overriding the class Lamb using super keyword, to also get the implementations of the previous method
        Lamb lamb = new Lamb();
        lamb.legs();
    }
}
