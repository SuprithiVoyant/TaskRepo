package com.ivoyant.exceptions;

class NegativeRadiusException extends Exception{
    public NegativeRadiusException(String string){
        super(string);
    }
}
class radius{
    static void getRadios(int r) throws NegativeRadiusException {
        if(r<0){
            throw new NegativeRadiusException("radius cannot be negaitve");
        }
        double res =  (Math.PI*r*r);
        System.out.println(res);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        try{
            radius.getRadios(-7);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
    }
}
