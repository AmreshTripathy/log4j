package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c5f395d4-c8ed-4c3c-88e9-285a189bddca
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DetectCycleInAnUndirectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++)
            adj.add(i, new ArrayList<Integer>());
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        sc.close();
        boolean ans = isCycle(N, adj);
        System.out.println((ans) ? 1 : 0);
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        // traverse through bfs
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) { // doing it for all components

            if (visited[i])
                continue;

            Queue<Integer> q = new LinkedList<>();
            q.add(i);

            while (q.size() > 0) {
                int curr = q.remove();

                if (visited[curr]) // already visited and again trying to visit from another node then it is cyclic
                    return true;

                visited[curr] = true;

                for (int nbr : adj.get(curr)) {
                    if (!visited[nbr])
                        q.add(nbr);
                }
            }
        }

        return false;
    }
}
