package com.OOPS.singletonClass;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionEager obj = DatabaseConnectionEager.getInstance();

        DatabaseConnectionLazy obj2 = DatabaseConnectionLazy.getInstance();

        DatabaseConnectionBillPugh obj3 = DatabaseConnectionBillPugh.getInstance();
        

    }
}
