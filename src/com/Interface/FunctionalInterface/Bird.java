package com.Interface.FunctionalInterface;

@FunctionalInterface
public interface Bird {
    void fly();

    default void sing(){
        System.out.println("Bird is singing");
    }

    static void eat(){
        System.out.println("Bird is eating");
    }

    String toString();

}
