package com.ivoyant.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameworks {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        System.out.println("Executors started!");
        for(int i=0; i<10; i++){
            int finalI = i;
            executor.submit(()->{
                System.out.println(factorial(finalI));
            });
        }
        executor.shutdown();
        try{
            executor.awaitTermination(1, TimeUnit.MILLISECONDS);
            System.out.println("Executor terminated!");
        } catch (InterruptedException e) {
            System.out.println("Exceeded!");
        }

    }

    static long factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
