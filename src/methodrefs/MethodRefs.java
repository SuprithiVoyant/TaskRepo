package methodrefs;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodRefs {

    public static void print1(String s){
        System.out.println(s);
    }

    public void print2(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Rat","Pig","Dog","Cat"));

        //If the method is static
        System.out.println("Printing from print1 : ");
        animals.forEach(MethodRefs::print1);

        //if the method is non-static, just create an object for it and then do the same.
        System.out.println("Printing from print2 : ");
        MethodRefs ref = new MethodRefs();
        animals.forEach(ref::print2);

    }

}




