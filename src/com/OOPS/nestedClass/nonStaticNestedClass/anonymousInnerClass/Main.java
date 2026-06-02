package com.OOPS.nestedClass.nonStaticNestedClass.anonymousInnerClass;

public class Main {

    public static void main(String[] args) {
        Car carObj = new Car(){
            public void pressBreak(){
                System.out.println("Applying break");
            }
        };

        carObj.pressBreak();
    }
}

abstract class Car{
    public abstract void pressBreak();
}
