package com.problems.PaymentSystem.entity;

import com.problems.PaymentSystem.enums.PaymentMethods;
import com.problems.PaymentSystem.enums.PaymentStatus;

import java.math.BigDecimal;

public class Payment {
    private Long paymentId;
    private BigDecimal amount;
    private PaymentMethods paymentMethods;
    private PaymentStatus paymentStatus;


    public Payment(){}

    public Payment(Long paymentId, BigDecimal amount, PaymentMethods paymentMethods, PaymentStatus paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethods = paymentMethods;
        this.paymentStatus = paymentStatus;
    }


    public Long getPaymentId() {
        return paymentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }


    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }


}
