package com.SOLID.OCP.BetterCode;

public class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Email sent successfully.");
    }
}
