package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9b2d5eac-703f-487c-8921-a9a641811594
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // directed graph
            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) // this node must have been marked as visited because of some previous node
                                    // where we applied bfs
                continue;

            bfs(i, visited, graph);
        }

        sc.close();
    }

    private static void bfs(int currentNode, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        Queue<Integer> q = new LinkedList<>();
        q.add(currentNode);

        while (q.size() > 0) {
            // remove from queue
            int curr = q.remove();

            if (visited[curr])
                continue;

            visited[curr] = true;
            System.out.print(curr + " ");

            for (int nbr : graph.get(curr)) {
                if (!visited[nbr])
                    q.add(nbr);
            }
        }
    }
}