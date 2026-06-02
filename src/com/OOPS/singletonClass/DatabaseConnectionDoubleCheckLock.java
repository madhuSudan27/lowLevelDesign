package com.OOPS.singletonClass;

public class DatabaseConnectionDoubleCheckLock {
    private static volatile DatabaseConnectionDoubleCheckLock instance;

    private DatabaseConnectionDoubleCheckLock(){};

    private static DatabaseConnectionDoubleCheckLock getInstance(){
        if(instance == null){
            synchronized (DatabaseConnectionDoubleCheckLock.class){
                if(instance == null){
                    instance = new DatabaseConnectionDoubleCheckLock();
                }
            }
        }
        return  instance;
    }

}
