package com.ivoyant.oops.inheritance;

import org.w3c.dom.ls.LSOutput;

class Factory{
    void pollution(){
        boolean pollution = true;
        System.out.println("Pollution : "+pollution);
    }
}
class GlassFactory extends Factory{
    void airPollution(){
        boolean hazard = true;
        System.out.println("Hazard : "+hazard);
    }
}

class WoodFactory extends Factory{
    void airPollution(){
        boolean hazard = false;
        System.out.println("Hazard :"+hazard);
    }
}

class OakFactory extends WoodFactory{
    void rare(){
        boolean rare = true;
        System.out.println("Rare : "+rare);
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        //Single level inheritance
        System.out.println("For Glass factory --->");
        GlassFactory glass = new GlassFactory();
        glass.airPollution();
        glass.pollution();


        //Multi-Level inheritance
        System.out.println("For Oak factory --->");
        OakFactory oak = new OakFactory();
        oak.pollution();
        oak.rare();
        oak.airPollution();
    }
}
//Combination of 2 or more inheritances can be called as Hybrid inheritance