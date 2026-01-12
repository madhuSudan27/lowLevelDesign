package com.Algorithms.DFS;

import java.util.LinkedList;

public class RecursiveDFS {
    public static void dfs(LinkedList<Integer>[] adjacencyList, int currentNode, boolean[]visited){
        visited[currentNode] = true;
        // print currentNode
        System.out.println(currentNode);

        // now explore neighbour
        for(int neighbour : adjacencyList[currentNode]){
            if(!visited[neighbour]){
                dfs(adjacencyList, neighbour, visited);
            }
        }

    }
}
