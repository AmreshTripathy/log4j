package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/longest-common-subsequence/
 * https://www.youtube.com/watch?v=NPZn9jBrX8U
 */

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        sc.close();
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    private static int longestCommonSubsequence(String text1, String text2) {

        // Brute Force Approach : Generate all subsequence and match it and get max
        // length
        // So TC will be 2^n X 2^m

        // So optimised will be
        // Checking character one by one by indexing
        // if matching both index =- 1;
        // else there are two scenarios either go left and right
        // then take max count

        // to optimize the space we store all the count in a matrix for memorization

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        return function(n - 1, m - 1, text1, text2, dp);
    }

    private static int function(int i, int j, String text1, String text2, int[][] dp) {

        // Base case : < 0 index
        if (i < 0 || j < 0)
            return 0;

        // if alredy present the count for specific index then return
        if (dp[i][j] != -1)
            return dp[i][j];

        // checking both index's character is equal or not
        if (text1.charAt(i) == text2.charAt(j))
            return dp[i][j] = 1 + function(i - 1, j - 1, text1, text2, dp); // increase count

        // else check for i - 1 & j AND i & j - 1
        return dp[i][j] = Math.max(function(i - 1, j, text1, text2, dp), function(i, j - 1, text1, text2, dp));
    }
}
