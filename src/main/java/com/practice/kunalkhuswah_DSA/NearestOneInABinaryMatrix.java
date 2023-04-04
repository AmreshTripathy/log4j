package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=5ebeb2e9-0c47-4fd9-a7b9-5fbb1ecbe30b
 */

import java.util.Scanner;

public class NearestOneInABinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        sc.close();
        int[][] ans = nearest(grid);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] nearest(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    int count[] = new int[1];
                    count[0] = Integer.MAX_VALUE;
                    dfs(grid, i, j, i, j, n, m, count);
                    ans[i][j] = count[0];
                }
            }
        }

        return ans;
    }

    private static void dfs(int[][] grid, int base_i, int base_j, int i, int j, int n, int m, int[] count) {

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == -1)
            return;

        if (grid[i][j] == 1) {
            int dis = Math.abs(base_i - i) + Math.abs(base_j - j);
            count[0] = Math.min(count[0], dis);
            return;
        }

        int temp = grid[i][j];
        grid[i][j] = -1;

        dfs(grid, base_i, base_j, i, j - 1, n, m, count); // left
        dfs(grid, base_i, base_j, i - 1, j, n, m, count); // top
        dfs(grid, base_i, base_j, i, j + 1, n, m, count); // right
        dfs(grid, base_i, base_j, i + 1, j, n, m, count); // bottom

        grid[i][j] = temp;
    }
}
