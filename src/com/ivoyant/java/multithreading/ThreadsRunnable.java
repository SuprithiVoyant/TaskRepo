package com.ivoyant.multithreading;

class ThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName()+"->"+i);

        }
    }
}

class ThreadRunnable2 implements Runnable{
    public void run(){
        for(int i=10; i<=20; i++){
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}

public class ThreadsRunnable {
    public static void main(String[] args) throws InterruptedException {
        ThreadRunnable1 t1 = new ThreadRunnable1();
        ThreadRunnable2 t2 = new ThreadRunnable2();

        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);



        tt1.setName("SuperMan");
        tt1.start();
        tt2.setName("Batman");
        tt2.start();

        System.out.println("ID of this thread is : "+tt1.getId());
        System.out.println("ID of this thread is : "+tt2.getId());

        tt2.setPriority(6);

        System.out.println("Priority of thread 1 : "+tt1.getPriority());
        System.out.println("Priority of thread 2 : "+tt2.getPriority());

    }
}
