package com.OOPS.singletonClass;

public class DatabaseConnectionSynchronized {
    private static DatabaseConnectionSynchronized instance;

    private DatabaseConnectionSynchronized(){};

    /*
        synchronized
        monitor based mutual exclusion mechanism(lock)
        Changes made by one thread become visible to others after the lock is released.

     */
     public static synchronized DatabaseConnectionSynchronized getInstance(){
        if(instance == null){
            instance = new DatabaseConnectionSynchronized();
        }
        return instance;
    }
}


