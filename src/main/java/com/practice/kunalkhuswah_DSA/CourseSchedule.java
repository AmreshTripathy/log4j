package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=98332447-d28d-42ee-9843-3d4d9d5ea20d
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CourseSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++)
                prerequisites[i][j] = sc.nextInt();
        }
        sc.close();
        System.out.println(canFinish(N, prerequisites));
    }

    public static int canFinish(int n, int[][] prerequisites) {
        // write your code here

        // create cyclic list for all

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        boolean[] path = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i])
                if (isCyclic(i, graph, visited, path))
                    return 0;
        }

        return 1;
    }

    private static boolean isCyclic(int i, ArrayList<ArrayList<Integer>> graph, boolean[] visited, boolean[] path) {

        visited[i] = true;
        path[i] = true;

        for (int nbr : graph.get(i)) {

            if (visited[nbr] && path[nbr])
                return true;

            boolean flag = false;
            if (!visited[nbr]) {
                flag = isCyclic(nbr, graph, visited, path);
            }

            if (flag)
                return true;
        }
        
        path[i] = false;
        return false;
    }
}
