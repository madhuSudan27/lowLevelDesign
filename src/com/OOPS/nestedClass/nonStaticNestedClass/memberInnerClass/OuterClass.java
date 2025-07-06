package com.OOPS.nestedClass.nonStaticNestedClass.memberInnerClass;

public class OuterClass {
    int instanceVaraible = 10;
    static String staticVariable = "OuterClass static variable";

     class InnerClass {
        String innerClassInstanceVariable = "InnerClass instance variable";
        static final  String innerClassStaticVariable = "InnerClass static variable";
        public void print() {
            System.out.println(OuterClass.staticVariable);
            System.out.println("OuterClass non static variable" + instanceVaraible);
        }
    }

    private class PrivateInnerClass {
        public void print() {
            System.out.println("Executing the method of private nested class");
            System.out.println(OuterClass.staticVariable);
        }
    }

    public PrivateInnerClass getObjectOfPrivateInnerClass() {
         return new PrivateInnerClass();
    }

    public void printPrivateNestedClassPrintMethod() {
        PrivateInnerClass privateInnerClass = getObjectOfPrivateInnerClass();
        privateInnerClass.print();
    }
}
