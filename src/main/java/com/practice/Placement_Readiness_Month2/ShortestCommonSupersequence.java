package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/shortest-common-supersequence/
 * https://course.acciojob.com/idle?question=67547211-a7d6-47ad-b578-32ece0d9808b
 * https://www.youtube.com/watch?v=xElxAuBcvsU
 */

import java.util.Scanner;

public class ShortestCommonSupersequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();
        System.out.println(shortestCommonSupersequence(str1, str2));
    }

    private static String shortestCommonSupersequence(String str1, String str2) {

        // DP CONCEPTS
        // Refer -> https://leetcode.com/problems/longest-common-subsequence/
        int n = str1.length();
        int m = str2.length();

        // Creating a table to memorize matching count
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // making common subsequence
        StringBuilder sb = new StringBuilder();
        while (n > 0 && m > 0) {
            if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
                sb.append(str1.charAt(n - 1));
                n--;
                m--;
            } else if (dp[n - 1][m] > dp[n][m - 1]) {
                sb.append(str1.charAt(n - 1));
                n--;
            } else {
                sb.append(str2.charAt(m - 1));
                m--;
            }
        }

        while (n > 0) {
            sb.append(str1.charAt(n - 1));
            n--;
        }

        while (m > 0) {
            sb.append(str2.charAt(m - 1));
            m--;
        }

        sb.reverse();
        return sb.toString();
    }
}
