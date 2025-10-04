package com.MultiThreading.CustomLock.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        SharedResources resource1 = new SharedResources();
        SharedResources resource2 = new SharedResources();

        ReentrantLock lock = new ReentrantLock();

        Thread thread1 = new Thread(()->{
            resource1.produce(lock);
        });

        Thread thread2 = new Thread(()->{
            resource2.produce(lock);
        });

        thread1.start();
        thread2.start();
    }
}
