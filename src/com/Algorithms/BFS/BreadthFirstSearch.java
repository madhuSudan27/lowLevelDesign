package com.Algorithms.BFS;

import java.util.LinkedList;
import java.util.Deque;

public class BreadthFirstSearch {

    public static void bfs(LinkedList<Integer>[]graph, int source){

        boolean[] visited = new boolean[graph.length];
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(source);

        visited[source] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();

            System.out.println(current);

            for(int node : graph[current]){
                if(!visited[node]){
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
    }
}
