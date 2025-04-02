package foreach;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("sham");
        names.add("Sita");
        names.add("Reo");

        //using for each loop
        for(String name : names){
            System.out.println(name);
        }

        //using for each loop using lambda expressions
        names.forEach( name -> System.out.println(name));

    }
}
