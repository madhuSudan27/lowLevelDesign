package com.Interface.FunctionalInterface;

public class UsingLambda {
    public static void main(String[] args) {

        Bird sparrowObject = () -> System.out.println("Sparrow is flying");

        // see the magic
        sparrowObject.fly();
    }
}
