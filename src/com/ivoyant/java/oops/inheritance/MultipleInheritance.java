package com.ivoyant.oops.inheritance;

interface A{
    void printA();
}

interface B{
    void printB();
}

class C implements A,B{
    @Override
    public void printA(){
        System.out.println("Printing -> A");
    }

    @Override
    public void printB() {
        System.out.println("Printing -> B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.printA();
        c.printB();
    }
}

//Multiple inheritance is subclass obtaining the properties of multiple superclasses.
//It's not possible using classes due to ambiguity.
//It's possible through interfaces as they do not extend to any common ancestors and also they do not contain constructors.