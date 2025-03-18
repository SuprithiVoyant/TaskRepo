package com.ivoyant.threads;

//Creating threads using Thread Class

class Thread1 extends Thread{
    @Override
    public void run() {
        int count = 10;
        for(int i=0; i<count; i++){
            System.out.println(i);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        int count = 20;
        for(int i=10; i<count; i++){
            System.out.println(i);
        }
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
