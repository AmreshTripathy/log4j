package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/possible-bipartition/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PossibleBipartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int[][] dislikes = new int[e][2];
        for (int i = 0; i < e; i++) {
            dislikes[i][0] = sc.nextInt();
            dislikes[i][1] = sc.nextInt();
        }

        sc.close();

        System.out.println(possibleBipartition(n, dislikes));
    }

    private static boolean possibleBipartition(int n, int[][] dislikes) {

        // creating a graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < dislikes.length; i++) {
            int u = dislikes[i][0];
            int v = dislikes[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }


        // in biparte we use coloring algorithm
        // so creating one visited array by storing their color

        int[] visited = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                // we need to clor this
                boolean isBiparte = dfs(i, visited, graph, 1);
                if (!isBiparte)
                    return false;
            }
        }
        
        return true;
    }

    private static boolean dfs(int i, int[] visited, ArrayList<ArrayList<Integer>> graph, int color) {

        visited[i] = color;
        int nbrColor = (color == 1) ? 2 : 1;

        for (int nbr : graph.get(i)) {
            if (visited[nbr] == 0) {
                boolean isBiparte = dfs(nbr, visited, graph, nbrColor);
                if (!isBiparte)
                    return false;
            }else if (visited[nbr] == color) {
                return false;
            }
        }

        return true;
    }
}
