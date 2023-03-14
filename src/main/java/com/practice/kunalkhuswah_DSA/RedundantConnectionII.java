package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/redundant-connection-ii/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RedundantConnectionII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();

        int[][] edges = new int[e][2];
        for (int i = 0; i < e; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        sc.close();
        System.out.println(Arrays.toString(findRedundantDirectedConnection(edges)));
    }

    private static int[] findRedundantDirectedConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = edges.length;

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
        }

        int[] ans = new int[2];
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!visited[i])
                bfs(i, visited, graph, ans);
        }

        return ans;
    }

    public static void bfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> graph, int[] ans) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while (q.size() > 0) {
            int curr = q.remove();
            if (visited[curr])
                continue;

            visited[curr] = true;

            for (int nbr : graph.get(curr)) {
                if (visited[nbr] || q.contains(nbr)) {
                    ans[0] = curr;
                    ans[1] = nbr;
                }else {
                    q.add(nbr);
                }
            }
        }
    }
}
