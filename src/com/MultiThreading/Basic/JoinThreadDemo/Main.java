package com.MultiThreading.Basic.JoinThreadDemo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread execution started");

        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{

            sharedResource.produce();
        }, "Thread-1");

        thread1.start();
        try{
            thread1.join();
        }
        catch (Exception e){

        }

        System.out.println("Main thread execution ended");
    }
}
