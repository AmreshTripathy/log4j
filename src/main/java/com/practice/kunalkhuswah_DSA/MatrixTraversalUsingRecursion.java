package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=44959323-6b15-4725-9312-4a0b7fb532c3
 */

import java.util.Scanner;

public class MatrixTraversalUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        MatTraverseRecur(mat);
    }

    public static void MatTraverseRecur(int[][] mat) {
        // Write your code here

        helper(mat, 0, 0, mat.length, mat[0].length);
    }

    public static void helper(int[][] mat, int i, int j, int n, int m) {
        if (i == n)
            return;

        if (j == m) {
            System.out.println();
            helper(mat, i + 1, 0, n, m);
        } else {
            System.out.print(mat[i][j] + " ");
            helper(mat, i, j + 1, n, m);
        }
    }
}
