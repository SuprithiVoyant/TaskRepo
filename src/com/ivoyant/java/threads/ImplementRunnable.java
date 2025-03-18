package com.ivoyant.threads;

//Threads using runnable Interface

class Threads1 implements Runnable{
    @Override
    public void run() {
        int count = 10;
        for(int i=0; i<count; i++){
            System.out.println(i);
        }
    }
}

class Threads2 implements Runnable{
    @Override
    public void run() {
        int count = 20;
        for(int i=10; i<count; i++){
            System.out.println(i);
        }
    }
}

public class ImplementRunnable {
    public static void main(String[] args) {

        Threads1 threads1 = new Threads1();
        Threads2 threads2 = new Threads2();

        Thread tt1 = new Thread(threads1);
        Thread tt2 = new Thread(threads2);

        tt1.start();
        tt2.start();
    }
}
