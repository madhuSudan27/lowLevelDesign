package com.Interface.FunctionalInterface.typesOfFunctionalInterface.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, String> assignTask = (Integer val)->{

            String stringVal = val.toString();
            return  stringVal;
        };

        System.out.println(assignTask.doHomeWork(10));
    }
}
