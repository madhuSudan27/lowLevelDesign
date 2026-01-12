package com.Algorithms.DFS;

import java.util.LinkedList;
import java.util.Stack;

public class StackBasedDfs<T> {
    public static  void stackDfs(LinkedList<Integer>[] adjacencyList , Integer source ){

        // we have to keep record of visited node so we don't visit again
        // we have to use stack to traverse the entire graph

        boolean[] isVisited = new boolean[adjacencyList.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(source);
        isVisited[source] = true;

        while(!stack.isEmpty()){
            int current = stack.pop();
            // print the currentNode
            System.out.println(current+ " -> ");

            // explore neighbours;

            for(int neighbour : adjacencyList[current]){
                if(!isVisited[neighbour]){
                    stack.push(neighbour);
                    isVisited[neighbour] = true;
                }
            }

        }
    }
}
