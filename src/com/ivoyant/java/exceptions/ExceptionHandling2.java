package com.ivoyant.exceptions;

class calculate{
    static void calci(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Divided by zero!");
        }
        int res = a/b;
        System.out.println(res);
    }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            calculate.calci(45,0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}



//throw--->
//usually written inside a method
//can throw only single exception as a time
//throw is used for throwing an exception

//throws--->
//written outside a method
//can propagate multiple exceptions
//throws is mainly used for propagating an exception

