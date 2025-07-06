package com.SOLID.ISP.problematicCode;

public class SmartLight implements ISmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("light is turned off");
    }

    @Override
    public void play() {
        // redundant code
    }

    @Override
    public void pause() {
        // redundant code
    }

    @Override
    public void stop() {
        // no need to implement
    }

    @Override
    public void next() {
        // no need to implement
    }

    @Override
    public void previous() {
        // no need to implement
    }

    @Override
    public void rotateCamera() {
        // no need to implement
    }

    @Override
    public void adjustBrightness() {
        // no need to implement
    }

    @Override
    public void lock() {
        // no need to implement
    }

    @Override
    public void unlock() {
        // no need to implement
    }
}
