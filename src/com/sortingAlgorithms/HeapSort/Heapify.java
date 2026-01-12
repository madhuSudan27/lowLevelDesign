package com.sortingAlgorithms.HeapSort;
import  java.util.List;
import java.util.ArrayList;

public class Heapify {

    public static void main(String[] args) {
        List<Integer> minHeap = new ArrayList<>();

        Heapify obj = new Heapify();
        minHeap.add(13);
        minHeap.add(21);
        minHeap.add(16);
        minHeap.add(24);
        minHeap.add(31);
        minHeap.add(19);
        minHeap.add(68);
        minHeap.add(65);
        minHeap.add(26);
        minHeap.add(32);
        obj.printHeap(minHeap);

        obj.insert(minHeap, 14);

        obj.printHeap(minHeap);
        obj.insert(minHeap, 10);
        obj.printHeap(minHeap);

        obj.deleteRoot(minHeap);
        obj.printHeap(minHeap);

        obj.deleteRoot(minHeap);
        obj.printHeap(minHeap);


    }

    // heapifyUp for mean heap


    // the function will place a node at it write position
    public void heapifyUp(List<Integer> heap , int index){
        int parentIndex = (index - 1) / 2;
        // if index is 0 <- in this case we have to do nothing
        // also if parent is smaller <- in this case we have to do nothing

        // we will only deal with case if index > 0 && parent is greater
        if(index > 0 && heap.get(index) < heap.get(parentIndex)){
            // we have to swap
            int temp = heap.get(index);
            heap.set(index,heap.get(parentIndex));
            heap.set(parentIndex, temp);
            heapifyUp(heap, parentIndex);
        }

    }

    // Deleting a top element from heap
    public  void heapifyDown(List<Integer> heap, int index){

        // we have to check both child
        // left & right and swap with the smallest one
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallestChild = index;

        // we have to also check weather left & right children is within range or not

        if(leftChild < heap.size() && heap.get(leftChild) < heap.get(smallestChild)){
            smallestChild = leftChild;
        }
        if(rightChild < heap.size() && heap.get(rightChild) < heap.get(smallestChild)){
            smallestChild = rightChild;
        }

        // swap only if smallestChild != root
        if(smallestChild != index){
            int temp = heap.get(smallestChild);
            heap.set(smallestChild, heap.get(index));
            heap.set(index, temp);
            heapifyDown(heap, smallestChild);
        }
    }


    public void deleteRoot(List<Integer> heap){
        // base case :- empty heap
        int size = heap.size();
        if(size == 0){
            System.out.println("Heap is Empty");
            return;
        }
        // heap is not empty

        // delete root & swap with last element

        heap.set(0, heap.get(size - 1));
        // also need to remove the last element
        heap.remove(size - 1);

        heapifyDown(heap, 0);
    }

    public  void  insert(List<Integer> heap, int value){
        // will add element to heap end
        heap.add(value);
        heapifyUp(heap, heap.size() - 1);
    }

    public  void printHeap(List<Integer> heap){
        System.out.println(heap);
    }
}
