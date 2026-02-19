package com.Algorithms.sorting;

public class SelectionSort implements Sorting {

    public  int[] sort(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            // now we can swap the element
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}
