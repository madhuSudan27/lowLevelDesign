package com.MultiThreading.Basic;

public class MultithreadingLearning implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running " + Thread.currentThread().getName());
    }
}
