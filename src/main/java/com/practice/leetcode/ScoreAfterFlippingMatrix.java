package com.practice.leetcode;

import java.util.Scanner;

public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        sc.close();
        System.out.println(matrixScore(grid));
    }

    private static int matrixScore(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        // If any index in first column found 0 then total row's 0's and 1's will exchange
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 0)
                changeRow(grid, i);
        }

        // check count 1's in every column except first because it's already checked in previous step
        for (int j = 1; j < m; j++) {
            int countOne = 0;

            for (int i = 0; i < n; i++)
                if (grid[i][j] == 1)
                    countOne++;

            if (countOne * 2 < n)
                changeColumn(grid, j);
        }

        // change binary to decimal
        int result = 0;
        for (int[] rows : grid) {
            result += convertBinaryToDecimal(rows);
        }

        return result;
    }

    private static int convertBinaryToDecimal(int[] rows) {
        int result = 0;

        for (int num : rows)
            result = result * 2 + num;

        return result;
    }

    private static void changeColumn(int[][] grid, int j) {
        for (int i = 0; i < grid.length; i++)
            grid[i][j] = 1 - grid[i][j];
    }

    private static void changeRow(int[][] grid, int i) {
        for (int j = 0; j < grid[0].length; j++)
            grid[i][j] = 1 - grid[i][j];
    }
}
