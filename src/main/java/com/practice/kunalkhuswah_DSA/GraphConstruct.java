package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GraphConstruct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = constructGraph(n);
        // taking input for edges
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // undirected graph
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + graph.get(i));
        }

        sc.close();
    }

    private static ArrayList<ArrayList<Integer>> constructGraph(int n) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        return graph;
        // this return an arrayList of arrayList having n empty arrayList
    }
}
