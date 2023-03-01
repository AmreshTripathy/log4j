package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=717ac001-d919-4e01-ae4e-db1cbc4b8cba
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PossibleBipartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int dislike[][] = new int[M][2];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++)
                dislike[i][j] = sc.nextInt();
        }
        sc.close();
        System.out.println(possibleBipartition(N, dislike));
    }

    public static int possibleBipartition(int n, int[][] dislikes) {
        // Write your code here

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < dislikes.length; i++) {
            int u = dislikes[i][0];
            int v = dislikes[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] visited = new int[n + 1];

        // range is between 1 to n so travelling from 1

        for (int i = 1; i <= n; i++) {
            if (visited[i] != 0)
                continue;

            boolean isComponentBiparted = isBipartedDFS(i, 1, visited, graph);
            if(!isComponentBiparted)
                return 0;
        }

        return 1;
    }

    private static boolean isBipartedDFS(int currentNode, int color, int[] visited, ArrayList<ArrayList<Integer>> graph) {

        visited[currentNode] = color;
        int nbrColor = (color == 1) ? 2 : 1;

        for (int nbr : graph.get(currentNode)) {
            if (visited[nbr] == 0) {
                boolean isComponentBiparted = isBipartedDFS(nbr, nbrColor, visited, graph);
                if (!isComponentBiparted)
                    return false;
            } else if (visited[nbr] == color) {
                return false;
            }
        }


        return true;
    }
}
