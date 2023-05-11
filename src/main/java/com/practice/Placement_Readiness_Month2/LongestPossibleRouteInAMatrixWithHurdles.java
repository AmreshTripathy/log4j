package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=07f64edb-63a1-49c7-9929-042ad7eda233
 */

import java.util.Scanner;

public class LongestPossibleRouteInAMatrixWithHurdles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        System.out.println(findLongestPath(mat, 0, 0, x, y, n, m));
    }

    private static int findLongestPath(int[][] mat, int i, int j, int x, int y, int R, int C) {
        int[] max = new int[1];

        helper(mat, i, j, x, y, 0, max);

        return max[0] == 0 ? -1 : max[0];
    }

    private static void helper(int[][] mat, int i, int j, int x, int y, int count, int[] max) {

        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0 || mat[i][j] == -1)
            return;

        if (i == x && j == y) {
            max[0] = Math.max(max[0], count);
            return;
        }

        // traversing from left right top bottom
        int temp = mat[i][j];
        mat[i][j] = -1;

        helper(mat, i, j - 1, x, y, count + 1, max); // left
        helper(mat, i - 1, j, x, y, count + 1, max); // top
        helper(mat, i, j + 1, x, y, count + 1, max); // right
        helper(mat, i + 1, j, x, y, count + 1, max); // bottom

        mat[i][j] = temp;
    }
}
