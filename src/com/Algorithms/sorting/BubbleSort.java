package com.Algorithms.sorting;

public class BubbleSort implements Sorting {

    public  int[] sort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            for(int j = 1; j < n- i; j++){
                if(arr[j - 1] > arr[j] ){
                    int temp = arr[j- 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        return arr;
    }
}
