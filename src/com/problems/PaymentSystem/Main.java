package com.problems.PaymentSystem;

import com.problems.PaymentSystem.entity.Payment;
import com.problems.PaymentSystem.enums.PaymentMethods;
import com.problems.PaymentSystem.enums.PaymentStatus;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Payment myPaymentObject = new Payment();
        Payment paymentDoneByMohan = new Payment(1L, new BigDecimal(23), PaymentMethods.UPI, PaymentStatus.SUCCESS);
    }
}
