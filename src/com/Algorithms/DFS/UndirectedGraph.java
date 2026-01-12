package com.Algorithms.DFS;

import java.util.LinkedList;

// considering the graph is 0 based
public class UndirectedGraph {
    private  int vertices;
    private LinkedList<Integer>[] adjacencyList;

    UndirectedGraph(int vertices){
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for(int i = 0; i < vertices; i ++){
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }

    public LinkedList<Integer>[] getAdjacencyList() {
        return  adjacencyList;
    }
}
