package com.MultiThreading.Basic;



public class Main {
    public static void main(String[] args) {

        System.out.println(" Main thread is running " + Thread.currentThread().getName());
        Runnable multithreadingLearning = new MultithreadingLearning();
        Demo demo = new Demo();
        /*
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        demo.message();
                    }
                }
        );
         */

        Thread thread = new Thread(multithreadingLearning);
        thread.start();


        System.out.println(" Main thread Ends " + Thread.currentThread().getName());
    }
}
