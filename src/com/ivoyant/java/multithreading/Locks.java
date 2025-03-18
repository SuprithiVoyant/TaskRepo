package com.ivoyant.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bank {

    private int balance = 1000;

    Lock lock = new ReentrantLock();

    public  void withdrawal(int amount) throws InterruptedException {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount+" INR");
                try{
                    if(balance >= amount){
                        System.out.println("Processing...");
                        Thread.sleep(1000);
                        System.out.println("Withdrawn amount :"+amount);
                        balance -= amount;
                        System.out.println("Remaining Balance : "+balance);
                    }else{
                        System.out.println("Insufficient Balance...");
                        System.out.println("Current Balance : "+balance);
                    }
                    System.out.println();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Currently in lock, "+Thread.currentThread().getName()+" Please try later!");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Locks{
    public static void main(String[] args) {
        Bank sbi = new Bank();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    sbi.withdrawal(700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(task,"User 1");
        Thread t2 = new Thread(task,"User 2");
        t1.start();
        System.out.println(t1.getName()+"->"+t1.getState());
        t2.start();
        System.out.println(t2.getName()+"->"+t2.getState());
    }
}
