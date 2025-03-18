package com.ivoyant.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resources{
    Lock lock = new ReentrantLock(true);
    public void accessResource(){
        try{
            if(lock.tryLock()){
                System.out.println("Entered : "+Thread.currentThread().getName());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println("Exit : "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
}

public class FairnessLocks {
    public static void main(String[] args){
        Resources example = new Resources();
        Runnable tasks = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread t1 = new Thread(tasks,"Thread 1");
        Thread t2 = new Thread(tasks,"Thread 2");
        Thread t3 = new Thread(tasks,"Thread 3");

        try {
            t1.start();
            Thread.sleep(100);
            t2.start();
            Thread.sleep(100);
            t3.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
