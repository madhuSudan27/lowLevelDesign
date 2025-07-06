package com.SOLID.ISP.BetterCode;

public class SmartCurtain implements IMovable, ILockable{

    @Override
    public void lock() {
        System.out.println("locking smart curtain");
    }

    @Override
    public void unlock() {
        System.out.println("unlocking smart curtain");
    }

    @Override
    public void next() {
        System.out.println("Spreading smart curtain");
    }

    @Override
    public void previous() {
        System.out.println("Wrapping smart curtain");
    }
}
