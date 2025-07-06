package com.SOLID.OCP.BetterCode;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new SmsNotifier());
        notificationService.sendNotification(new EmailNotifier());
        notificationService.sendNotification(new WhatsappNotifier());
    }
}
