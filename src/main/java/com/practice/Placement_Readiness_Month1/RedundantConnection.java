package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=504c7464-d786-42b5-8807-4ff8e3b64918
 */

import java.util.Scanner;

public class RedundantConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        int[][] edges = new int[n][2];
        for (int i = 0; i < n; ++i) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        sc.close();
        int[] ans = findRedundantConnection(edges);
        for (int i = 0; i < 2; ++i) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] findRedundantConnection(int[][] edges) {
        // write your code here
        int[] ans = new int[2];

        // Create parent array
        int[] parent = new int[1001];
        for (int i = 0; i < 1001; i++)
            parent[i] = i;

        // check parent edge wise

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            int p1 = findParent(u, parent);
            int p2 = findParent(v, parent);

            if (p1 == p2)
                ans = edge;

            parent[p2] = p1;
        }

        return ans;
    }

    private static int findParent(int n, int[] parent) {

        if (n == parent[n])
            return n;

        return findParent(parent[n], parent);
    }
}
