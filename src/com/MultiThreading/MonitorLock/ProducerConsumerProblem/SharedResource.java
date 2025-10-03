package com.MultiThreading.MonitorLock.ProducerConsumerProblem;

import java.util.ArrayDeque;
import java.util.Deque;

public class SharedResource {

    Deque<Integer> sharedQueue = new ArrayDeque<>(5);

    public synchronized void produce() {
        System.out.println("----Producer is called by thread :- "+ Thread.currentThread().getName());

        // if sharedQueue is full then we have to wait

        while(sharedQueue.size() == 5){
            System.out.println("----Buffer is full waiting to consume by consumers!");
            try{
                wait();
            }
            catch (Exception e){

            }
        }

        sharedQueue.add(1);
        System.out.println("----Producer produced the item with thread "+ Thread.currentThread().getName() + " Now notifying all consumers to consume! ");
        notifyAll();
    }

    public synchronized void consume() {
        System.out.println("****Consumer is invoked by thread :- " + Thread.currentThread().getName());

        // we have to wait if buffer is empty

        while(sharedQueue.isEmpty()){
            System.out.println("****Buffer is empty waiting for producer to produce! ");
            try{
                wait();
            }
            catch (Exception e){

            }
        }

        sharedQueue.poll();
        System.out.println("Consumer consumed the item with thread :- "+ Thread.currentThread().getName() + "Now notifying all producer to produce!");
        notifyAll();

    }
}
