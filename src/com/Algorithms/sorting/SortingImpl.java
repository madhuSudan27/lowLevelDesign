package com.Algorithms.sorting;

public class SortingImpl {

    private Sorting sortingAlgorithm;

    SortingImpl(){

    }

    SortingImpl(Sorting sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int[] sort(int[]arr){
        return sortingAlgorithm.sort(arr);
    }
}
