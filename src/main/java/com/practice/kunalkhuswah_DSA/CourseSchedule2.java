package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6f9356f8-63d7-41b3-9967-0bcaf5d2e8b8
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CourseSchedule2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++)
                prerequisites[i][j] = sc.nextInt();
        }

        int[] ans = canFinish(N, prerequisites);
        if (ans.length == 0)
            System.out.println(-1);
        else {
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }

            System.out.println("");
        }
        sc.close();
    }

    public static int[] canFinish(int n, int[][] prerequisites) {
        // Write your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) 
            graph.add(new ArrayList<>());

        int[] indegree = new int[n];
        for (int[] edge : prerequisites) {
            int ai = edge[0];
            int bi = edge[1];

            indegree[ai]++;
            graph.get(bi).add(ai);
        }

        // adding indegree with 0 to Queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int[] topo = new int[n];
        int idx = 0;
        // bfs start
        while (q.size() > 0) {
            int front = q.remove();
            topo[idx++] = front;

            for (int nbr : graph.get(front)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0)
                    q.add(nbr);
            }
        }

        if (idx != n) {
            return new int[0];
        }

        return topo;
    }
}
