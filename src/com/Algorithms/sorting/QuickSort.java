package com.Algorithms.sorting;

public class QuickSort implements Sorting{

    public int[] sort(int[] arr){
//        sortWithLastPivot(arr, 0, arr.length - 1);
        sortWithFirstPivot(arr, 0, arr.length - 1);
        return arr;
    }

    private void sortWithLastPivot(int[] arr, int left, int right){
        if(left < right){
            int pivot = findLastPivot(arr, left, right);
            sortWithLastPivot(arr, left, pivot - 1);
            sortWithLastPivot(arr, pivot + 1, right);
        }
    }

    private void sortWithFirstPivot(int[] arr, int left, int right){
        if(left < right){
            int pivot = findFirstPivot(arr, left, right);
            sortWithFirstPivot(arr, left, pivot - 1);
            sortWithFirstPivot(arr, pivot + 1, right);
        }
    }

    private  int findLastPivot(int[] arr, int left, int right){
        // rightMost element as pivot
        int pivot = arr[right];
        // will going to hold the next index where pivot would be placed
        int prev = left - 1;

        for(int i = left; i < right; i ++){
            if(arr[i] <= pivot){
                ++prev;
                swap(arr, prev, i);
            }
        }
        ++prev;
        swap(arr, prev, right);
        return prev;
    }


    private int findFirstPivot(int[] arr, int left, int right){
        // first element as pivot
        int pivot = arr[left];
        int start = left + 1, end = right;
        while(start <= end){
            while(start <= end && arr[start] <= pivot ){
                start ++;
            }
            while (start <= end && arr[end] > pivot){
                end --;
            }
            // now wea re at a point where we might need to swap
            if(start < end){
                swap(arr, start, end);
            }
        }

        swap(arr, left, end );
        return end;
    }


    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
