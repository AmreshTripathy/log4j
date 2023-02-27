package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2b6f51da-cb55-412f-a0b5-47724e221ca3
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathBetween2Vertices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U = sc.nextInt();
        int V = sc.nextInt();
        if (check(N, M, Edges, U, V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    private static boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges, int U, int V) {
        // create a adjacency graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < Edges.size(); i++) {
            int u = Edges.get(i).get(0);
            int v = Edges.get(i).get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean ans = checkInBfs(N, U, V, graph);
        return ans;
    }

    private static boolean checkInBfs(int n, int u, int v, ArrayList<ArrayList<Integer>> graph) {

        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(u);

        while (q.size() > 0) {
            int curr = q.remove();

            if (curr == v)
                return true;

            if(visited[curr])
                continue;

            visited[curr] = true;
            for (int nbr : graph.get(curr)) {
                if (!visited[nbr])
                    q.add(nbr);
            }
            
        }

        return false;
    }
}
