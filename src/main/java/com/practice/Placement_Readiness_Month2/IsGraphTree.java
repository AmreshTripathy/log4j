package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=f10e32c0-3a7f-450c-a074-541fc8e7540f
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsGraphTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                arr.add(sc.nextInt());
            }
            edgeList.add(arr);
        }

        sc.close();
        boolean ans = isGraphTree(n, edgeList);
        if (ans) {
            System.out.print("1\n");
        } else {
            System.out.print("0\n");
        }
    }

    private static boolean isGraphTree(int n, ArrayList<ArrayList<Integer>> edgeList) {

        // Checking Whether a graph is cyclic or not
        // if cyclic it's not a tree or else it's a tree
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (ArrayList<Integer> edge : edgeList) {
            int u = edge.get(0);
            int v = edge.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            if (isCyclic(i, n, graph, visited))
                return false;
        }

        return true;
    }

    private static boolean isCyclic(int i, int n, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while (q.size() > 0) {
            int curr = q.poll();

            if (visited[curr])
                return true;

            visited[curr] = true;

            for (int nbr : graph.get(curr)) {
                if (!visited[nbr])
                    q.add(nbr);
            }
        }

        return false;
    }
}
