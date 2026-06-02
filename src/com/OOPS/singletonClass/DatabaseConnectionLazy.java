package com.OOPS.singletonClass;

public class DatabaseConnectionLazy {
    private static DatabaseConnectionLazy instance;
    private DatabaseConnectionLazy(){}


    // lazy initialization
    public static DatabaseConnectionLazy getInstance(){
        if(instance == null){
            instance = new DatabaseConnectionLazy();
        }
        return  instance;
    }




}
