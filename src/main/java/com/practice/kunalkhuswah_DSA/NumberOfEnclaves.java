package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=1cc7969f-f49d-43ab-9f75-84d3921b4b4f
 */

import java.util.Scanner;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(numEnclaves(grid));
    }

    public static int numEnclaves(int[][] grid) {
        // your code here

        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < m; j++)
                    destroy(i, j, grid);
            } else {
                destroy(i, 0, grid);
                destroy(i, m - 1, grid);
            }
        }
        int count = 0;
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1) count++;

        return count;
    }

    public static void destroy(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
            return;

        grid[i][j] = 0;

        destroy(i - 1, j, grid); // up
        destroy(i + 1, j, grid); // down
        destroy(i, j - 1, grid); // left
        destroy(i, j + 1, grid); // right
    }
}
