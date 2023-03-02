package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=26b8e834-7f3c-4b98-abe6-07a88ff548f1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SpreadingInfection {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    static class Pair {
        int node;
        int time;

        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

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
        int t = Integer.parseInt(br.readLine());

        // write your code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, 0));

        boolean[] visited = new boolean[vtces];
        int ans = 0;

        while (q.size() > 0 && q.peek().time < t) {
            Pair curr = q.remove();
            if (visited[curr.node])
                continue;

            if (curr.time <= t)
                ans += 1;

            visited[curr.node] = true;

            for (Edge e : graph[curr.node]) {
                if (visited[e.nbr] == false)
                    q.add(new Pair(e.nbr, curr.time + 1));
            }
        }

        System.out.println(ans);
    }
}
