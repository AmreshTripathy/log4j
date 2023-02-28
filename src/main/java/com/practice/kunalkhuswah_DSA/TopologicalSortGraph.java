package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSortGraph {
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

        topologicalSort(V, adj);
    }

    private static void topologicalSort(int v, ArrayList<ArrayList<Integer>> adj) {
        // using dfs

        // In topological sort u must come before v
        // so we add nodes at post order of the dfs

        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!visited[i])
                dfs (i, adj, visited, st);
        }

        List<Integer> lis = new ArrayList<>();

        while (st.size() > 0)
            lis.add(st.pop());
        
        System.out.println(lis);
        
    }

    private static void dfs(int currentNode, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st) {

        visited[currentNode] = true;

        for (int nbr : adj.get(currentNode)) {
            if(!visited[nbr])
                dfs(nbr, adj, visited, st);
        }

        st.add(currentNode);

    }
}
