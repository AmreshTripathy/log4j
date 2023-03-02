package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=029e7dd4-5198-4d4f-a4ea-0363bc35e731
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberofDistinctIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int ans = countDistinctIslands(grid);
        System.out.println(ans);
    }

    static StringBuilder path;
    public static int countDistinctIslands(int[][] grid) {
        // write your code here

        int n = grid.length;
        int m = grid[0].length;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    path = new StringBuilder();
                    destroy(i, j, grid, "x");
                    set.add(path.toString());
                }
            }
        }

        return set.size();
      }

    private static void destroy(int i, int j, int[][] grid, String direction) {

        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
            return;

        grid[i][j] = 0;
        path.append(direction);
        destroy(i - 1, j, grid, "u"); // up
        destroy(i + 1, j, grid, "d"); // down
        destroy(i, j - 1, grid, "l"); // left
        destroy(i, j + 1, grid, "r"); // right

        path.append("z");
    }
}
