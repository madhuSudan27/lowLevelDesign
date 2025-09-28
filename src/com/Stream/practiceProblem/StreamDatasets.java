package com.Stream.practiceProblem;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;
    String department;
    public Employee(int id, String name, double salary, String department) {
        this.id = id; this.name = name; this.salary = salary; this.department = department;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public double getSalary(){return salary;}
    public String getDepartment(){return department;}
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

class Transaction {
    String id;
    String type; // "CREDIT" or "DEBIT"
    double amount;
    public Transaction(String id, String type, double amount) {
        this.id = id; this.type = type; this.amount = amount;
    }
    public String getId(){return id;}
    public String getType(){return type;}
    public double getAmount(){return amount;}
    public String toString(){ return id + ":" + type + ":" + amount; }
}

public class StreamDatasets {
    public static List<Integer> numbers = Arrays.asList(3, 6, 2, 6, 9, 12, 15, 2, 18, 21, 30);
    public static List<String> words = Arrays.asList("apple","banana","avocado","bob","alphabet","code","developer","stream","java","optional");
    public static List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5),
            Arrays.asList(6,7,8,9),
            Arrays.asList(10)
    );
    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", 45000, "HR"),
            new Employee(2, "Bina", 75000, "Engineering"),
            new Employee(3, "Chirag", 120000, "Engineering"),
            new Employee(4, "Deepa", 50000, "Sales"),
            new Employee(5, "Esha", 85000, "Engineering"),
            new Employee(6, "Faiz", 30000, "HR"),
            new Employee(7, "Gita", 110000, "Sales")
    );
    public static List<Transaction> transactions = Arrays.asList(
            new Transaction("T1","CREDIT", 1500),
            new Transaction("T2","DEBIT", 500),
            new Transaction("T3","CREDIT", 7000),
            new Transaction("T4","DEBIT", 2300),
            new Transaction("T5","CREDIT", 1200)
    );
}

