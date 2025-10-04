package com.MultiThreading.Basic.JoinThreadDemo;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acquired by "+ Thread.currentThread().getName() );
        try{
            Thread.sleep(10000);
        }
        catch (Exception e){
        }
        isAvailable = true;
        System.out.println("Lock released by "+ Thread.currentThread().getName() );
    }
}
