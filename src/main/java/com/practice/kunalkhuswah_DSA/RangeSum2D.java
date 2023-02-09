package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e0420aa8-f4e9-4a99-abe5-0cf0b05b3ce1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangeSum2D {
    static class Pair {
        int row1;
        int row2;
        int col1;
        int col2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];
        
        for (int i = 0; i < q; i++) {
            Pair p = new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i] = p;
        }
        List<Integer> ans = solve(matrix, query);
        for (int x : ans)
            System.out.println(x);
        sc.close();
    }

    private static List<Integer> solve(int[][] matrix, Pair[] query) {
        int[][] pref = new int[matrix.length][matrix[0].length];
        build(pref, matrix);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < query.length; i++) {
            int r1 = query[i].row1;
            int c1 = query[i].col1;
            int r2 = query[i].row2;
            int c2 = query[i].col2;
            ans.add(getQuery(pref, r1, c1, r2, c2));
        }

        return ans;
    }

    private static void build(int[][] pref, int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = matrix[i][j];
                int b = j - 1 >= 0 ? pref[i][j - 1] : 0;
                int c = i - 1 >= 0 ? pref[i - 1][j] : 0;
                int d = i - 1 >= 0 && j - 1 >= 0 ? pref[i - 1][j - 1] : 0;
                pref[i][j] = a + b + c - d;
            }
        }
    }

    private static int getQuery(int[][] pref, int r1, int c1, int r2, int c2) {
        int A = pref[r2][c2];
        int B = c1 - 1 >= 0 ? pref[r2][c1 - 1] : 0;
        int C = r1 - 1 >= 0 ? pref[r1 - 1][c2] : 0;
        int D = r1 - 1 >= 0 && c1 - 1 >= 0 ? pref[r1 - 1][c1 - 1] : 0;

        return A - B - C + D;
    }
}
