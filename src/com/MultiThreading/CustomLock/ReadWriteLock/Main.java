package com.MultiThreading.CustomLock.ReadWriteLock;



import com.MultiThreading.CustomLock.ReadWriteLock.SharedResources;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {

        SharedResources resource1 = new SharedResources();
        SharedResources resource2 = new SharedResources();
        SharedResources resource3 = new SharedResources();

        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread thread1 = new Thread(()->{
           resource1.consume(lock);
        });

        Thread thread2 = new Thread(()->{
            resource2.consume(lock);
        });

        Thread thread3 = new Thread(()->{
            resource3.produce(lock);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
