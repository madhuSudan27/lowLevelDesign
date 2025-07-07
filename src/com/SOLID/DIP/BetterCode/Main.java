package com.SOLID.DIP.BetterCode;

public class Main {

    public static void main(String[] args) {

        // choose a payment method
        // feed amount to payment service
        //  proceed further

        PaymentService paymentService = new PaymentService(new Upi());
        paymentService.processPayment(1000);
        // choose a payment method
//        UPI, PayPal, DebitCard, creditCard, NetBanking, RupayCard

        paymentService.setPaymentMethod(new DebitCard());
        paymentService.processPayment(2000);

        paymentService.setPaymentMethod(new CreditCard());
        paymentService.processPayment(3000);

        paymentService.setPaymentMethod(new NetBanking());
        paymentService.processPayment(4000);


    }
}
