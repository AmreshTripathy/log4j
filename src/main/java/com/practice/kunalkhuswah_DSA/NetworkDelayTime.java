package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=30eaae97-49d8-4a2b-a6ac-6f8ce9e2281f
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NetworkDelayTime {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int v, e;
        v = sc.nextInt();
        e = sc.nextInt();
        // Create adjacency list of edges
        LinkedList<List<Integer>> adj[] = new LinkedList[v + 1];
        for (int i = 0; i <= v; i++)
            adj[i] = new LinkedList<>();

        for (int i = 0; i < e; i++) {
            int u, v1, w;
            u = sc.nextInt();
            v1 = sc.nextInt();
            w = sc.nextInt();
            adj[u].add(Arrays.asList(v1, w));
        }
        sc.close();
        System.out.println(delayTime(v, adj));
    }

    static class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static int delayTime(int V, LinkedList<List<Integer>> adj[]) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            return a.cost - b.cost;
        });

        pq.add(new Pair(1, 0));
        boolean[] visited = new boolean[V + 1];
        int ans = 0;

        while (pq.size() > 0) {
            Pair curr = pq.remove();

            if (visited[curr.node])
                continue;

            visited[curr.node] = true;

            ans = curr.cost;

            for (List<Integer> edge: adj[curr.node]) {
                int nbr = edge.get(0);
                int wt = edge.get(1);

                if (!visited[nbr]) {
                    pq.add(new Pair(nbr, curr.cost + wt));
                }
            }
        }

        for (int i = 1; i <= V; i++)
                if (visited[i] == false)
                    return -1;

        return ans;
    }
}
