package com.SOLID.OCP.BetterCode;

public class SmsNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("SMS sent successfully.");
    }
}
