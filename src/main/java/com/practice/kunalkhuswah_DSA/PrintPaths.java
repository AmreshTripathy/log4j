package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=22e6cae8-a37e-4320-ae71-33322d382ed2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintPaths {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        printAllPath(graph, src, dest, vtces);
    }

    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void printAllPath(ArrayList<Edge>[] graph, int src, int dest, int n) {
        // Your code her
        boolean[] visited = new boolean[n];
        dfs (src, dest, graph, src + "", visited);
    }

    private static void dfs(int src, int dest, ArrayList<Edge>[] graph, String ans, boolean[] visited) {

        if (src == dest) {
            System.out.println(ans);
            return;
        }

        visited[src] = true;

        for (Edge e : graph[src]) {
            if (!visited[e.nbr])
                dfs(e.nbr, dest, graph, ans + e.nbr, visited);
        }

        visited[src] = false;
    }
}
