package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ea0ba181-faaa-4ec3-89d2-c40d022b321f
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CountComponents {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String S[] = read.readLine().split(" ");
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < N; j++)
                temp.add(Integer.parseInt(S[j]));
            adj.add(temp);
        }

        System.out.println(components(adj, N));
    }

    private static int components(ArrayList<ArrayList<Integer>> adj, int N) {
        int count = 0;

        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                count += 1;
                dfs(i, adj, visited);
            }
        }

        return count;
    }

    private static void dfs(int currentNode, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[currentNode] = true;

        ArrayList<Integer> lis = adj.get(currentNode);
        for (int i = 0; i < lis.size(); i++) {
            if (lis.get(i) == 1 && visited[i] == false) {
                dfs(i, adj, visited);
            }
        }
    }
}
