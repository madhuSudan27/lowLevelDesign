package com.OOPS.nestedClass.nonStaticNestedClass.localInnerClass;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    public void display(){
        int methodLocalVariable = 30;
        class LocalInnerClass{
            int localInnerVariable = 40;
            public void print(){
                System.out.println("InstanceVariable:- "+ instanceVariable + " classVariable:- "+ classVariable+
                        " methodLocalVariable:- "+ methodLocalVariable + " localInnerVariable:- "+ localInnerVariable);

            }
        }

        LocalInnerClass obj = new LocalInnerClass();
        obj.print();
    }
}
