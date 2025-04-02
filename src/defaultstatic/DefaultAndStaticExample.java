package defaultstatic;

interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method in an interface.");
    }

    default void anotherDefaultMethod() {
        System.out.println("This is another default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method in an interface.");
    }

    static void anotherStaticMethod() {
        System.out.println("This is another static method.");
    }
}

class MyClass implements MyInterface {
    public void customMethod() {
        System.out.println("This is a custom method in MyClass.");
    }
}

public class DefaultAndStaticExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod();
        obj.anotherDefaultMethod();
        obj.customMethod();
        MyInterface.staticMethod();
        MyInterface.anotherStaticMethod();
    }
}

//Default Methods
//Use the default keyword.
//Can be called by class objects.
//Can be overridden if needed.

//Static Methods:
//Use the static keyword.
//Belong to the interface, not to objects.
//Called using the interface name.