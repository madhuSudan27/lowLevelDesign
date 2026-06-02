package com.OOPS.singletonClass;

public class DatabaseConnectionEager {

//    final protects reference integrity it does not makes object immutable
    private static final DatabaseConnectionEager INSTANCE = new DatabaseConnectionEager();

    private DatabaseConnectionEager(){
    }

    public static DatabaseConnectionEager getInstance(){
        return INSTANCE;
    }
}
