package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NetworkDelayTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int e = sc.nextInt();
        int[][] times = new int[e][3];

        for (int i = 0; i < e; i++) {
            times[i][0] = sc.nextInt();
            times[i][1] = sc.nextInt();
            times[i][2] = sc.nextInt();
        }

        sc.close();
        System.out.println(networkDelayTime(times, n, k));
    }
    
    static class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            return a.cost - b.cost;
        });

        LinkedList<List<Integer>> adj[] = new LinkedList[n+1];
        for(int i=0;i<=n;i++)
            adj[i] = new LinkedList<>();

        for(int i=0;i<times.length;i++){
            int u,v,w;
            u = times[i][0];
            v = times[i][1];
            w = times[i][2];
            adj[u].add(Arrays.asList(v,w));
        }
		
        pq.add(new Pair(k, 0));
        boolean[] visited = new boolean[n + 1];
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

        for (int i = 1; i <= n; i++)
                if (visited[i] == false)
                    return -1;

        return ans;
    }
}
