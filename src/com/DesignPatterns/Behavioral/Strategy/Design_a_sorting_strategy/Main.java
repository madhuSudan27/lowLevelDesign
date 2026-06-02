package com.DesignPatterns.Behavioral.Strategy.Design_a_sorting_strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5,1,4,2,8));
        List<Integer> list1 = new ArrayList<>(List.of(8,7,6,5,4,3,2,1));
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sortNumbers(list1);
        System.out.println(list1);
    }
}
