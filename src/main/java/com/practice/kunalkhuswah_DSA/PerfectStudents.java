package com.practice.kunalkhuswah_DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PerfectStudents {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int vtces = n;
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = k;
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        System.out.println(perfectStudents(n, graph));
    }

    public static int perfectStudents(int vtces, ArrayList<Edge>[] graph) {
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();
        boolean[] visited = new boolean[vtces];

        for (int v = 0; v < vtces; v++) {
            if (visited[v])
                continue;
            
            ArrayList<Integer> lis = new ArrayList<>();
            dfs(v, visited, graph, lis);
            components.add(lis);
        }

        int pairs = 0;

        for (int i = 0; i < components.size(); i++) {
            for (int j = i + 1; j < components.size(); j++) {
                int count = components.get(i).size() * components.get(j).size();
                pairs += count;
            }
        }

        return pairs;
    }

    private static void dfs(int currentNode, boolean[] visited, ArrayList<Edge>[] graph, ArrayList<Integer> lis) {
        visited[currentNode] = true;

        lis.add(currentNode);

        for (Edge e : graph[currentNode]) {
            if (!visited[e.nbr])
                dfs(e.nbr, visited, graph, lis);
        }
    }
}
