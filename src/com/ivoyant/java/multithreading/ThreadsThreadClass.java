package com.ivoyant.multithreading;

class ThreadClass1 extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10;i++){
            System.out.println(i);
        }
    }
}

class ThreadClass2 extends Thread{
    public ThreadClass2(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Current thread name is "+Thread.currentThread().getName());
    }
}

public class ThreadsThreadClass {
    public static void main(String[] args) {
        ThreadClass1 threadClass1 = new ThreadClass1();

        ThreadClass2 threadClass01 = new ThreadClass2("Iron man");
        ThreadClass2 threadClass02 = new ThreadClass2("Bat man");
        ThreadClass2 threadClass03 = new ThreadClass2("Super man");
        ThreadClass2 threadClass04 = new ThreadClass2("Spider man");
        ThreadClass2 threadClass05 = new ThreadClass2("Hanuman");

        threadClass05.setPriority(10);

        threadClass01.start();
        threadClass02.start();
        threadClass03.start();
        threadClass04.start();
        threadClass05.start();







    }
}
