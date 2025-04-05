package singleton;

public class Main {
    public static void main(String[] args) {

        //throughout the application only 1 object is created and is being used.

        Printer printer1 = Printer.getPrinter();
        printer1.print("Document 1 printing");
        System.out.println("Address -> "+printer1);

        Printer printer2 = Printer.getPrinter();
        printer1.print("Document 2 printing");
        System.out.println("Address -> "+printer2);

        Printer printer3 = Printer.getPrinter();
        printer1.print("Document 3 printing");
        System.out.println("Address -> "+printer3);
    }
}

