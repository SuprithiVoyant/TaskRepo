package singleton;

public class Printer {

    //public and static instance of the class
    private static Printer printer;

    //private constructor
    private Printer(){
        System.out.println("Printer initialized");
    }

    //public method to provide access to the instance
    public static Printer getPrinter(){
        if(printer == null){
            printer = new Printer();
        }
        return printer;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }


}
