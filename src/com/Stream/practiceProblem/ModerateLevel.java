package com.Stream.practiceProblem;


import java.util.*;
import java.util.stream.*;

public class ModerateLevel {
    public static void main(String[] args) {

        List<Employee> employees = StreamDatasets.employees;
        List<String> names = new ModerateLevel().getEmployeeNames(employees);
        printList(names);

        List<Employee> emplees = new ModerateLevel().getEmployeesHavingSalaryGreaterThan(employees, 50000);
        printList(emplees);

        double salary = new ModerateLevel().findSecondHighestSalary(employees);
        System.out.println(salary);

    }

    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

    public List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = employees.stream()
                .map((e) -> e.getName())
                .collect(Collectors.toList());
        return names;
    }

    public List<Employee> getEmployeesHavingSalaryGreaterThan(List<Employee> employees, double salary) {
        List<Employee> emplees = employees.stream()
                .filter((e)-> e.getSalary() > salary)
                .collect(Collectors.toList());
        return  emplees;
    }

    public double findSecondHighestSalary(List<Employee> employees) {
        double salary = employees.stream()
                .map((e)->e.getSalary())
                .distinct()
                .sorted((Double a, Double b) -> Double.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(0.0);
        return salary;
    }
}



