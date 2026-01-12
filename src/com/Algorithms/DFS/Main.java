package com.Algorithms.DFS;

public class Main {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);

//        StackBasedDfs.stackDfs(graph.getAdjacencyList(), 2);

        boolean[] visited = new boolean[5];

        RecursiveDFS.dfs(graph.getAdjacencyList(), 0,visited);

    }
}
