package com.MultiThreading.MonitorLock.SharedResource;

import javax.swing.plaf.TableHeaderUI;
import java.sql.SQLOutput;

public class ProduceTask implements Runnable{

    SharedResource sharedResource ;

    ProduceTask(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread " + Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }
        catch (Exception e) {

        }
        sharedResource.produce();
    }
}
