package com.SOLID.OCP.problematicCode;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new SmsNotification());
        notificationService.sendNotification(new EmailNotification());
    }
}
