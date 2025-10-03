package com.MultiThreading.MonitorLock.Deadlock;

public class SharedResource {

    boolean isItemAvailable = false;

    public synchronized void produce()  {
        System.out.println("Lock acquired by "+ Thread.currentThread().getName() );
        isItemAvailable = true;

        // let's sleep this one for 10 sec
        try{
            Thread.sleep(10000);
        }
        catch (Exception e){

        }
        System.out.println("Lock released by "+ Thread.currentThread().getName() );
    }
}
