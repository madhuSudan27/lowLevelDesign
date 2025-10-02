package com.MultiThreading.MonitorLock;

public class MonitorLockExampleMain {
    public static void main(String[] args) {

        MonitorLockExample obj = new MonitorLockExample();

        MonitorThread1Runnable runnableObj = new MonitorThread1Runnable(obj);
        Thread thread1 = new Thread(runnableObj);

        Thread thread2 = new Thread(()->{
            obj.task2();
        });

        Thread thread3 = new Thread(()-> {obj.task3();});


        System.out.println("-------Thread1 call at time " + System.nanoTime() );
        thread1.start();
        System.out.println("-------Thread1 end at time " + System.nanoTime());
        System.out.println("-------Thread2 call at time " + System.nanoTime());
        thread2.start();
        System.out.println("-------Thread2 end at time " + System.nanoTime());
        System.out.println("-------Thread3 call at time " + System.nanoTime());
        thread3.start();
        System.out.println("-------Thread3 end at time " + System.nanoTime());


    }
}
