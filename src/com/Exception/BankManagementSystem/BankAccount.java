package com.Exception.BankManagementSystem;

public class BankAccount {
    private String holderName;
    private Double  balance;
    private String accountNumber;

    public BankAccount(String holderName, Double balance, String accountNumber) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
