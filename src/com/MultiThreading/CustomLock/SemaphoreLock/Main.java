package com.MultiThreading.CustomLock.SemaphoreLock;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread starts");
        ParkingLot parkingLot = new ParkingLot(2);

       for(int i = 0; i < 5; i++) {
           int finalI = i;
           new Thread(()->{
              parkingLot.parkCar(String.format("car-%s", finalI));
           }).start();
       }

        System.out.println("Main thread ends");
    }
}
