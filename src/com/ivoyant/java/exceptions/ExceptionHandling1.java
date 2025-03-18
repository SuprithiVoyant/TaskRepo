package com.ivoyant.exceptions;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        //wrap the possible exception throwing code in the try block.
        try{
            int i = 10/0;
        }
        //catch the exception and handle it.
        catch (ArithmeticException e){
            System.out.println("Handled by 1st catch block : "+e.getMessage());
        }
        try{
            String s = null;
            System.out.println(s.length());
        }
        //there can also be multiple catch blocks for a single try.
        //we can handle multiple exceptions using | symbol in a single catch block.
        catch (NullPointerException | ArithmeticException e ){
            System.out.println("Handled by 2nd catch block : "+e.getMessage());
            return;
        }
        catch (Exception e) {
            System.out.println("Handled by 3rd catch block : "+e.getMessage());
            return;
        }
        //finally will execute at the end no matter the try and catch blocks are executed or not.
        //using return keyword won't actually stop finally block from executing.
        //let's say we need to terminate the code before finally block, that time we can do it by using System.exit()
        finally {
            System.out.println("Finally executed!");
        }
    }
}

