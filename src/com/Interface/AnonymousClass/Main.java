package com.Interface.AnonymousClass;

public class Main {
    public static void main(String[] args) {

        /*

            What is an Anonymous Class?
            A class without a name, declared and instantiated in one single expression.

            They are usually used when:
            You want to override methods of an interface/abstract class just once.
            You don’t want the overhead of creating a separate class file.
         */

        Bike bike = new Bike(){
            public void run(){
                System.out.println("Running...");
            }
        };

        bike.run();

    }
}
