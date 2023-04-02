package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=5d8035f8-c8b0-4ceb-9057-90204aafb3f0
 */

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class EasyDijkstraProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(v);
            temp.add(w);
            graph.get(u).add(temp);
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        sc.close();

        findPath(graph, n, start, end);
    }

    static class Pair {
        int node;
        int wsf;

        Pair(int node, int wsf) {
            this.node = node;
            this.wsf = wsf;
        }
    }

    private static void findPath(ArrayList<ArrayList<ArrayList<Integer>>> graph, int n, int start, int end) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wsf - b.wsf);

        pq.add(new Pair(start, 0));
        boolean[] visited = new boolean[n + 1];

        while (pq.size() > 0) {
            Pair temp = pq.poll();

            if (visited[temp.node])
                continue;

            visited[temp.node] = true;

            if (temp.node == end) {
                System.out.println(temp.wsf);
                return;
            }

            for (ArrayList<Integer> nbr : graph.get(temp.node)) {
                if (!visited[nbr.get(0)])
                    pq.add(new Pair(nbr.get(0), temp.wsf + nbr.get(1)));
            }
        }

        System.out.println("NO");
    }
}
