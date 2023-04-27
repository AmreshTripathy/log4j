package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6e5b3a49-d991-4bf1-bf52-535a871cb46e
 */

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequence_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();

        System.out.println(longestCommonSubsequence(n, m, arr1, arr2));
        sc.close();
    }

    private static int longestCommonSubsequence(int n, int m, int[] arr1, int[] arr2) {
        // Refer to https://leetcode.com/problems/longest-common-subsequence/
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        return function(n - 1, m - 1, arr1, arr2, dp);
    }

    private static int function(int i, int j, int[] arr1, int[] arr2, int[][] dp) {

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (arr1[i] == arr2[j])
            return dp[i][j] = 1 + function(i - 1, j - 1, arr1, arr2, dp);

        return dp[i][j] = Math.max(function(i - 1, j, arr1, arr2, dp), function(i, j - 1, arr1, arr2, dp));
    }
}
