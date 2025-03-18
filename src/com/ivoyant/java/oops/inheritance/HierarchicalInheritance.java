package com.ivoyant.oops.inheritance;

class Family{
    void Happy(){
        System.out.println("happy family");
    }
}

class Dad extends Family{
    void dadFeels(){
        System.out.println("Dad is happy");
    }
}

class Mom extends Family{
    void momFeels(){
        System.out.println("Mom is happy");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Mom m = new Mom();
        m.momFeels();
        m.Happy();

        Dad d = new Dad();
        d.dadFeels();
        d.Happy();
    }
}

// A type of inheritance where multiple subclasses are extending to the a same superclass can be called as Hierarchical Inheritance.