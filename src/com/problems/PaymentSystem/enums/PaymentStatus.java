package com.problems.PaymentSystem.enums;

public enum PaymentStatus {
    PENDING("Pending Confirmation"),
    AUTHORIZED("Funds Locked"),
    SUCCESS("Payment Successful"),
    FAILED("Payment Failed"),
    CANCELLED("Cancelled by User"),
    EXPIRED("Session Expired"),
    REFUND_INITIATED("Refund in Progress"),
    REFUNDED("Refunded Successfully"),
    CHARGED_BACK("Disputed / Charged Back");

    private final String description;

    PaymentStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
