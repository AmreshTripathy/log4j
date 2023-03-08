package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/number-of-provinces/description/
 */

import java.util.Scanner;

public class NoOfProvinces_Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] isConnected = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                isConnected[i][j] = sc.nextInt();

        sc.close();
        int ans = findCircleNum(isConnected);
        System.out.println(ans);
    }

    private static int findCircleNum(int[][] isConnected) {
        
        int count = 0;
        int n = isConnected.length;

        // travelling row by row
        for (int i = 0; i < n; i++) {
            if (isConnected[i][i] == 1) {
                count++;
                dfs(i, isConnected);
            }
        }
        
        return count;
    }

    private static void dfs(int i, int[][] isConnected) {
        // travelling
        isConnected[i][i] = 0;

        // cheking all nodes is any node is connected to separate node

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1) {
                // change it to 0 because we are travelling through this
                isConnected[i][j] = 0;
                // checking if jth index is 1 or not
                // if 1 i is indirectly connected to j
                // so apply dfs again
                if (isConnected[j][j] == 1)
                    dfs(j, isConnected);
            }
        }
    }
}
