package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=bc51d934-d08b-4b7d-a852-2dec91e07bce
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DFSImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }

        DFSTraversal(ed, n);
        sc.close();
    }

    private static void DFSTraversal(List<List<Integer>> edges, int n) {

        // creating adjacency list from Line no. 33 - 44
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);

            // creating arryList for unordered graph
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        dfs(0, graph, visited);

    }

    private static void dfs(int currentNode, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        // mark visited
        visited[currentNode] = true;

        // do work (means print the current node)
        System.out.print(currentNode + " ");

        // before dfs we need to sort every arraylist (only doing it to accept in portal)
        Collections.sort(graph.get(currentNode));

        // explore other edges
        for (int nbr : graph.get(currentNode)) {
            // do dfs on those neighbours who are not visited
            if (!visited[nbr])
                dfs(nbr, graph, visited);
        }

    }
}
