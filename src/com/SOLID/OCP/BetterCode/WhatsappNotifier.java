package com.SOLID.OCP.BetterCode;

public class WhatsappNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("WhatsApp message sent successfully");
    }
}
