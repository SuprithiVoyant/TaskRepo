package com.ivoyant.oops.finalKeyword;

//this class can never be inherited, because final keyword restricts us to inherit a particular class.
final class A{
    String s = "Hello";
}

//the method greeting can never be overridden because we are using final keyword here as well.
class Greeting{
    final void greeting(){
        System.out.println("Greetings");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // the variable a cannot be reinitialized as final keyword on variables makes it constant.
        final int a = 12;
        System.out.println("Demo of final keyword in different situations");
    }
}

