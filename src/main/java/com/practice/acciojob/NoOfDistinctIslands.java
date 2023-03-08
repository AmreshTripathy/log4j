package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoOfDistinctIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        sc.close();
        int count = countDistinctIslands(grid);
        System.out.println(count);
    }

    private static int countDistinctIslands(int[][] grid) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    // now we need to destroy these with adding path
                    StringBuilder path = new StringBuilder();
                    destroy(i, j, path, grid, "x");
                    set.add(path.toString());
                    System.out.println(path);
                }
            }
        }

        return set.size();
    }

    private static void destroy(int i, int j, StringBuilder path, int[][] grid, String direction) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return;

        path.append(direction);
        grid[i][j] = 0; // changing the status of the visited direction

        destroy(i - 1, j, path, grid, "u"); // up
        destroy(i + 1, j, path, grid, "d"); // down
        destroy(i, j - 1, path, grid, "l"); // left
        destroy(i, j + 1, path, grid, "r"); // right

        path.append("z");
    }
}
