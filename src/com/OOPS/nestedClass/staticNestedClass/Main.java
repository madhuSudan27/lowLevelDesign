package com.OOPS.nestedClass.staticNestedClass;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        // Both will work fine
        System.out.println(outerClass.instanceVaraible);
        System.out.println(OuterClass.staticVariable);


        // how to access the methods of static nested class
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.print();
        nestedClass.printInstanceVariable();

        // print the private nested class
        outerClass.printPrivateNestedClassPrintMethod();
    }
}
