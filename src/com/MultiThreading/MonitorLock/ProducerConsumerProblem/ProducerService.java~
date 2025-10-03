package com.MultiThreading.MonitorLock.ProducerConsumerProblem;

public class ProducerService implements Runnable {

    SharedResource sharedResource;

    public ProducerService(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.produce();
    }


}
