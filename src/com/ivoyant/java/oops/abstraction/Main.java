package com.ivoyant.oops.abstraction;

//Using interfaces.
interface Bank{
    default void name(){
        System.out.println("Bank name : D-Bank");
    }
    void clients(int clients);
    void amount(double amount);
}

class DBank implements Bank{
    @Override
    public void clients(int clients) {
        System.out.println("Total Clients :"+clients);
    }
    @Override
    public void amount(double amount) {
        System.out.println("Total vault amount :"+amount);
    }
}

class SBank implements Bank{
    @Override
    public void clients(int clients) {
        System.out.println("Total Clients :"+clients);
    }
    @Override
    public void amount(double amount) {
        System.out.println("Total vault amount :"+amount);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Bank Details");
        System.out.println("-------------->");

        DBank dbank = new DBank();
        dbank.name();
        dbank.amount(35000.00);
        dbank.clients(120);

        System.out.println();

        SBank sbank = new SBank();
        System.out.println("Bank name : S-Bank");
        sbank.amount(46666.00);
        sbank.clients(124);
    }
}
