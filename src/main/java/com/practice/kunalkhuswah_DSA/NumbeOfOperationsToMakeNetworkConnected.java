package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=285d1fe6-ffdd-4d69-af16-0521a2df0533
 * https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NumbeOfOperationsToMakeNetworkConnected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int[][] connections = new int[e][2];
        for (int i = 0; i < e; i++) {
            connections[i][0] = sc.nextInt();
            connections[i][1] = sc.nextInt();
        }

        sc.close();
        int ans = makeConnected(n, connections);
        System.out.println(ans);
    }

    private static int makeConnected(int n, int[][] connections) {
        // if need to connect every node then we need to have n - 1 edges

        if (connections.length < n - 1)
            return -1;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < connections.length; i++) {
            int u = connections[i][0];
            int v = connections[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int componentCount = 0;

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                componentCount++;
                dfs(i, visited, graph);
            }
        }

        return componentCount - 1;
    }

    private static void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        
       visited[i] = true;

       for (int nbr : graph.get(i)) {
            if (!visited[nbr]) {
                dfs(nbr, visited, graph);
            }
       }

    }
}
