package com.MultiThreading.MonitorLock.SharedResource;

public class SharedResource {

    boolean isItemAvailable = true;

    public synchronized void produce()  {
        while (isItemAvailable) {
            try {
                System.out.println("----Item is Still Available waiting to consume by someone at thread "+ Thread.currentThread().getName());
                wait();
                System.out.println( "----Wait is over now Producing item at thread "+ Thread.currentThread().getName());
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isItemAvailable = true;
        System.out.println("----Item produced by thread "+ Thread.currentThread().getName() + " invoking all items who all are waiting to consume");
        notifyAll();
    }


    public synchronized void consume() {
        while (!isItemAvailable) {
            try {
                System.out.println("**********Item is not available waiting to produce by someone at thread " + Thread.currentThread().getName());
                wait(); // will release monitor lock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isItemAvailable = false;
        System.out.println("**********Item consumed by thread " + Thread.currentThread().getName());
//        System.out.println("**********Item consumed by thread " + Thread.currentThread().getName() + " invoking all items who all are waiting to produce");
//        notifyAll();
    }

}
