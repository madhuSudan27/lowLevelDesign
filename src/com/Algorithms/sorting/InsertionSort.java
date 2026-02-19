package com.Algorithms.sorting;

public class InsertionSort implements Sorting {

    public int[] sort(int[] arr){

        int n = arr.length;
        for(int index = 1; index < n; index++){
            int prev = index - 1;
            int unsortedElement = arr[index];

            while(prev >= 0 && arr[prev] > unsortedElement ){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = unsortedElement;
        }
        return arr;
    }
}
