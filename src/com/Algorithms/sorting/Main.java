package com.Algorithms.sorting;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {5, 1, 4, 2, 8};
        int[] arr2 = {3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {0, -1, 5, -10, 8};
        int[] arr5 = {10, 9, 8, 7, 6, 5};
        int[] arr6 = {100000, 1, 99999, 50000};


        printArray(new SortingImpl(new QuickSort()).sort(arr1));
        printArray(new SortingImpl(new QuickSort()).sort(arr2));
        printArray(new SortingImpl(new QuickSort()).sort(arr3));
        printArray(new SortingImpl(new QuickSort()).sort(arr4));
        printArray(new SortingImpl(new QuickSort()).sort(arr5));
        printArray(new SortingImpl(new QuickSort()).sort(arr6));
    }

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
