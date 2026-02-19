package com.Algorithms.sorting;

public class MergeSort implements Sorting{

    public int[] sort(int[] arr){
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[]arr, int left, int mid, int right){
        int leftArrayLength = mid - left + 1;
        int rightArrayLength = right - mid;

        // we need to copy the array so we can merge them together

        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for(int i = 0; i < leftArrayLength; i++){
            leftArray[i] = arr[i + left];
        }
        for(int i = 0; i < rightArrayLength; i++){
            rightArray[i] = arr[i + mid + 1];
        }

        int i = 0, j= 0, k = left;

        while(i < leftArrayLength && j < rightArrayLength){
            if(leftArray[i] < rightArray[j]){
                arr[k++] = leftArray[i++];
            }
            else {
                arr[k++] = rightArray[j++];
            }
        }

        while(i < leftArrayLength){
            arr[k++] = leftArray[i++];
        }
        while (j < rightArrayLength){
            arr[k++] = rightArray[j++];
        }
    }
}
