package com.MultiThreading.MonitorLock.ProducerConsumerProblem;

import java.util.ArrayDeque;
import java.util.Deque;

public class SharedResource {

    Deque<Integer> sharedQueue = new ArrayDeque<>(5);

    public synchronized void produce() {
    }

    public synchronized void consume() {

    }
}
