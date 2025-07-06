package com.SOLID.ISP.BetterCode;

public class SmartLight implements ISwitchable, IBrightnessAdjustable{
    @Override
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting brightness of smart light");
    }
}
