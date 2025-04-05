package factorydesign;

public class Main {

    //Hiding the actual logic for creating objects

    public static void main(String[] args) {
        OSfatory oSfatory = new OSfatory();

        OS open = oSfatory.getInstance("Open");
        open.description();

        OS closed = oSfatory.getInstance("Closed");
        closed.description();

        OS superComputer = oSfatory.getInstance("Super computer");
        superComputer.description();

    }
}
