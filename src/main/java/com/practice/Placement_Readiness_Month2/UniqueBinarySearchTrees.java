package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/unique-binary-search-trees/submissions/
 * https://course.acciojob.com/idle?question=7629ffcc-28a9-4576-a920-6e5f52991a52
 * https://www.youtube.com/watch?v=OIc0mHgHUww
 */

import java.util.Scanner;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(numTrees(n));
    }

    private static long numTrees(int n) {
        // We know for one node count is 1
        // 2 -> 2

        // We use dynamic program
        // using catalan algorithm
        // if n = 4 ; total count = c0*c3 + c1*c2 + c2 * c1 + c3 * c0

        if (n == 0 || n == 1)
            return 1;

        if (n == 2)
            return 2;

        long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = 0;

            for (int j = 0; j < i; j++) {
                // System.out.println(i + "->" + j + "*" + (i - j - 1));
                dp[i] += dp[j] * dp[i - j - 1];
            }
            // System.out.println(dp[i] + "\n" + "------------------");
        }

        return dp[n];
    }
}
