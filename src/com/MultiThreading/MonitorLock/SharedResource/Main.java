package com.MultiThreading.MonitorLock.SharedResource;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        ProduceTask produceTask = new ProduceTask(sharedResource);
        ConsumeTask consumeTask = new ConsumeTask(sharedResource);

        Thread thread1 = new Thread(produceTask, "Producer-1");
        Thread thread2 = new Thread(consumeTask, "Consumer-1");
        Thread thread3 = new Thread(produceTask, "Producer-2");
        Thread thread4 = new Thread(consumeTask, "Consumer-2");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
