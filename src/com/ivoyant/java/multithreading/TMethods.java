package com.ivoyant.multithreading;

class Thread001 extends Thread{
    @Override
     public void run() {
        for(int i=0; i<10; i = i+2){
            System.out.println("Even : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread002 extends Thread{
    @Override
     public void run() {
        for(int i=1; i<10; i= i +2){
            System.out.println("Odd : "+i);
        }
    }
}

class Thread003 extends Thread{
    @Override
    public void run() {
        for(int i=10; i<20; i++){
            System.out.println("number : "+i);
        }
    }
}

public class TMethods {
    public static void main(String[] args) throws InterruptedException {

        Thread001 t1 = new Thread001();
        Thread002 t2 = new Thread002();
        Thread003 t3 = new Thread003();

        System.out.println("Status : "+t1.getState());

        t1.start();
        t1.join();

        t2.start();
        t3.start();

        System.out.println("Status : "+t1.getState());
    }
}
