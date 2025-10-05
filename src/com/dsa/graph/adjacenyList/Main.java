package com.dsa.graph.adjacenyList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> graph = new ArrayList<>();
        int V = 5;
        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 4);

        System.out.println("BFS starting from 0");

        bfs(graph, 0);

    }

    private static void bfs(List<List<Integer>> graph, int i) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisited = new boolean[graph.size()];

        isVisited[i]= true;
        q.add(i);

        while(!q.isEmpty()) {
            Integer p = q.poll();
            System.out.print(p + " ");

            for(int j: graph.get(p)) {
                if(!isVisited[j]){
                  isVisited[j] = true;
                  q.add(j);
                }

            }
        }

    }

    private static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }


}
