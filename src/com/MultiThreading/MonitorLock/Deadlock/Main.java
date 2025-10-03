package com.MultiThreading.MonitorLock.Deadlock;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread execution started");

        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{
            System.out.println( Thread.currentThread().getName() +" Calling produce method");
            sharedResource.produce();
        }, "Thread-1");

        Thread thread2 = new Thread(()->{
            System.out.println( Thread.currentThread().getName() +" Calling produce method");
            // it will call the produce method after 2  sec so thread 1 will get the lock
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){

            }
            sharedResource.produce();
        }, "Thread-2");

        thread1.start();
        thread2.start();

        // after 4 second suspend the thread 1
        try{
            Thread.sleep(4000);
        }
        catch (Exception e) {

        }
        System.out.println("Suspending thread 1");
        // suspend method is used to suspend the thread
        // it is deprecated
        thread1.suspend();

        // again after 4 second resume the thread 1
        try{
            Thread.sleep(4000);
        }
        catch (Exception e) {

        }
        System.out.println("Resuming thread 1");
        // resume method is used to resume the suspended thread
        // it is deprecated
        thread1.resume();

        System.out.println("Main thread execution ends");
    }
}
