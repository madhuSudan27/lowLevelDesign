package com.MultiThreading.MonitorLock.ProducerConsumerProblem;

import com.MultiThreading.MonitorLock.SharedResource.ProduceTask;

import javax.crypto.CipherInputStream;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        ConsumerService consumerService = new ConsumerService(sharedResource);
        ProducerService producerService = new ProducerService(sharedResource);

        Thread consumerThread1 = new Thread(consumerService, "ConsumerThread1");
        Thread consumerThread2 = new Thread(consumerService, "ConsumerThread2");

        Thread producerThread1 = new Thread(producerService, "ProducerThread1");
        Thread producerThread2 = new Thread(producerService, "ProducerThread2");


        Thread consumerThread3 = new Thread(consumerService, "ConsumerThread3");
        Thread consumerThread4 = new Thread(consumerService, "ConsumerThread4");
        Thread consumerThread5 = new Thread(consumerService, "ConsumerThread5");

        Thread producerThread3 = new Thread(producerService, "ProducerThread3");
        Thread producerThread4 = new Thread(producerService, "ProducerThread4");

        Thread consumerThread6 = new Thread(consumerService, "ConsumerThread6");
        Thread consumerThread7 = new Thread(consumerService, "ConsumerThread7");
        Thread consumerThread8 = new Thread(consumerService, "ConsumerThread8");


        Thread producerThread5 = new Thread(producerService, "ProducerThread5");
        Thread producerThread6 = new Thread(producerService, "ProducerThread6");

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();
        consumerThread4.start();
        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
        producerThread4.start();

        consumerThread5.start();
        consumerThread6.start();
        producerThread5.start();
        producerThread6.start();

    }
}
