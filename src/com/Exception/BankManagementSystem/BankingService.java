package com.Exception.BankManagementSystem;

public interface BankingService {
    public void withdraw(double amount) throws Exception;
    public void deposit(double amount) throws Exception;
    public double getBalance();
}
