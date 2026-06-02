package com.DesignPatterns.Behavioral.Strategy.Design_a_sorting_strategy;

import java.util.List;

public class Sorter {

    private SortingStrategy sortingStrategy;

    Sorter(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sortNumbers(List<Integer> list){
        sortingStrategy.sort(list);
    }
}
