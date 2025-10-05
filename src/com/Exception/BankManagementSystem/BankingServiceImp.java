package com.Exception.BankManagementSystem;

import com.Exception.BankManagementSystem.Exceptions.InsufficientBalanceException;

public class BankingServiceImp implements BankingService {

    BankAccount account;

    public BankingServiceImp(BankAccount account){
        this.account = account;
    }

    @Override
    public void withdraw(double amount) throws IllegalAccessException {
        if(amount <= 0){
            throw  new IllegalAccessException("amount should be greater than 0");
        }
        if(amount > account.getBalance()){
            throw  new InsufficientBalanceException(String.format("Insufficient balance! you tried to withdraw %.2f but actual account balance is %.2f", amount, account.getBalance()));
        }

        account.setBalance(account.getBalance() - amount);
        System.out.println(String.format("Amount withdrawn successfully!! your current balance is %.2f. You have withdrawn %.2f", account.getBalance(), amount));
    }

    @Override
    public void deposit(double amount)throws IllegalAccessException {
        if (amount <= 0) {
            throw new IllegalAccessException("amount should be greater than 0");
        }
        account.setBalance(account.getBalance() + amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}
