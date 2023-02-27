package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=f418b898-6922-4c8a-91f3-9cf060a62957
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DetectCycleInADirectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(i, new ArrayList<Integer>());
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj.get(u).add(v);
        }
        sc.close();
        boolean ans = isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // Your code here

        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];

        return dfs(0, visited, path, adj);
    }

    private static boolean dfs(int currentNode, boolean[] visited, boolean[] path, ArrayList<ArrayList<Integer>> adj) {

        visited[currentNode] = true;
        path[currentNode] = true;

        for (int nbr : adj.get(currentNode)) {

            // if both the path and visited true means node is refering to the same node
            // which is previously visited and path is added
            if (visited[nbr] && path[nbr])
                return true;

            boolean nextAns = false;
            if (!visited[nbr])
                nextAns = dfs(nbr, visited, path, adj);

            if (nextAns)
                return true;

        }

        path[currentNode] = false;

        return false;
    }
}
