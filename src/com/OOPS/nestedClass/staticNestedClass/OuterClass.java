package com.OOPS.nestedClass.staticNestedClass;

public class OuterClass {
    int instanceVaraible = 10;
    static String staticVariable = "OuterClass static variable";

    public static class NestedClass {
        public void print() {
            System.out.println(OuterClass.staticVariable);
        }


        // To access the instance variable of OuterClass, we need to create an object of OuterClass
        public void printInstanceVariable() {
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.instanceVaraible);
        }

    }

    private static class PrivateNestedClass {
        public void print() {
            System.out.println("Executing the method of private nested class");
            System.out.println(OuterClass.staticVariable);
        }
        // how i can create the object of private nested class
    }

    public void printPrivateNestedClassPrintMethod() {
        PrivateNestedClass privateNestedClass = new PrivateNestedClass();
        privateNestedClass.print();
    }

}
