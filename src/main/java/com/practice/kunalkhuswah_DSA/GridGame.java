package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b060c528-aa9f-4b1e-8a7e-9c826b7a9939
 * https://leetcode.com/problems/grid-game/
 */

import java.util.Scanner;

public class GridGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[2][n];

        for(int i = 0; i < 2; i++)
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        sc.close();
        System.out.println(gridGame(grid));
    }

    private static long gridGame(int[][] grid) {
        int n = grid[0].length;

        long[] row_0 = new long[n];
        long[] row_1 = new long[n];

        // creating prefix sum of row_0
        row_0[0] = grid[0][0];

        for (int i = 1; i < n; i++)
            row_0[i] = grid[0][i] + row_0[i - 1];

        // creating prefix sum of row_0
        row_1[0] = grid[1][0];

        for (int i = 1; i < n; i++)
            row_1[i] = grid[1][i] + row_1[i - 1];

        // we know that we can only go downwards one so checking the right sub array sum and left sub array sum
        
        // here we are checking minimum between highest robot_2 sum
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long option_a = getSum(row_0, i + 1, n - 1);
            long option_b = getSum(row_1, 0, i - 1);

            long max = Math.max(option_a, option_b);
            min = Math.min(max, min);
        }

        return min;
    }

    private static long getSum(long[] pref, int left, int right) {
        if(right < 0)
            return 0;
        return (left == 0) ? pref[right] : pref[right] - pref[left - 1];
    }
}
