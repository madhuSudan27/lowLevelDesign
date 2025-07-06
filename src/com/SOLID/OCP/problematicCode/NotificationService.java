package com.SOLID.OCP.problematicCode;

public class NotificationService {

    public void sendNotification(Object notification) {
        if (notification instanceof EmailNotification) {
            EmailNotification emailNotification = (EmailNotification) notification;
            emailNotification.sendEmail();
        } else if (notification instanceof SmsNotification) {
            SmsNotification smsNotification = (SmsNotification) notification;
            smsNotification.sendSms();
        }
        // now suppose we need to add one more type of notification
        // need to modify this class to add new type of notification
        // violation of OCP
    }
}
