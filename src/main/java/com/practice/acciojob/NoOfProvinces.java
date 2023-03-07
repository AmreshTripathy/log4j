package com.practice.acciojob;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class NoOfProvinces {
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
        int ans = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[i][i] == 0)
                continue;

            ans += 1;
            dfs(isConnected, i);
        }

        return ans;
    }

    private static void dfs(int[][] isConnected, int i) {

        isConnected[i][i] = 0;

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1) {
                isConnected[i][j] = 0;
                if (isConnected[j][j] == 1)
                    dfs(isConnected, j);
            }
        }
    }
}
