package com.Exception.BankManagementSystem;

public class Main {
    public static void main(String[] args) {

        BankingService bankingService = new BankingServiceImp(new BankAccount("Madhu", 1000.0, "12345"));

        System.out.println(bankingService.getBalance());

        try{
            bankingService.withdraw(1000.0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(bankingService.getBalance());

        try{
            bankingService.deposit(-1000.0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(bankingService.getBalance());
        try{
            bankingService.deposit(1000.0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(bankingService.getBalance());
        try {
            bankingService.withdraw(2000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
