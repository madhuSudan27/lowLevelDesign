package com.MultiThreading.MonitorLock.ProducerConsumerProblem;

public class ConsumerService implements Runnable{

    SharedResource sharedResource;

    public ConsumerService(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.consume();
    }
}
