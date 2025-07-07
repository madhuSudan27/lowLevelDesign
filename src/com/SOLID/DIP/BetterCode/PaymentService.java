package com.SOLID.DIP.BetterCode;

public class PaymentService {

    PaymentMethod paymentMethod;

    PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
