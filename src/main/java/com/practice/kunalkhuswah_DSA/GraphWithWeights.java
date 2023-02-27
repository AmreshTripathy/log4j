package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GraphWithWeights {

    public static class Edge {
        int nbr;
        int wt;

        Edge(int n, int w) {
            this.nbr = n;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = constructGraph(n);
        // taking input for edges
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();

            // undirected graph
            graph.get(u).add(new Edge(v, wt));
            graph.get(v).add(new Edge(u, wt));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(i + ": (");
            for (Edge edge: graph.get(i)) {
                System.out.print(" [" + edge.nbr + " ," + edge.wt + " ]");
            }
            System.out.println(" )");
        }

        sc.close();
    }

    private static ArrayList<ArrayList<Edge>> constructGraph(int n) {

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        return graph;
        // this return an arrayList of arrayList having n empty arrayList
    }
}
