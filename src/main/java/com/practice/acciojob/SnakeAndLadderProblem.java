package com.practice.acciojob;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[2*n];
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = sc.nextInt();
            arr[i + 1] = sc.nextInt();
        }

        sc.close();
 
        System.out.println("Min Dice throws required is " + getMinDiceThrows(arr, n));
    }

    static class Pair {
        int node;
        int dist;

        Pair() {
            this.node = 0;
            this.dist = 0;
        }

        Pair (int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    private static int getMinDiceThrows(int[] arr, int n) {

        int[] moves = new int[30];
        Arrays.fill(moves, -1);
        
        for (int i = 0; i < 2*n; i += 2)
            moves[arr[i]-1] = arr[i + 1] - 1;

        boolean[] visited = new boolean[30];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0)); // adding 0th node with 0 distance 
        visited[0] = true;

        while (q.size() > 0) {
            Pair temp = q.remove();

            int curNode = temp.node;
            int curDist = temp.dist;

            if (curNode == 30 - 1) {
                return curDist;
            }

            // a dice has 6 options so we can roll it upto 6 times from 1 to 6
            for (int i = (curNode + 1); i <= (curNode + 6) && i < 30; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    int nextNode = i;
                    if (moves[i] != -1)
                        nextNode = moves[i];

                    q.add(new Pair(nextNode, curDist + 1));
                }
            }
        }

        return 0;
    }
}
