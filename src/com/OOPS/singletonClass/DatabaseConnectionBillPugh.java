package com.OOPS.singletonClass;

public class DatabaseConnectionBillPugh {

    private DatabaseConnectionBillPugh(){}

    private static class Helper{
        private static final DatabaseConnectionBillPugh INSTANCE = new DatabaseConnectionBillPugh();
    }

    public static DatabaseConnectionBillPugh getInstance(){
        return Helper.INSTANCE;
    }


}
