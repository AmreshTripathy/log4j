package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=91bfdb90-9f0c-4b9c-b4d5-f40a17b68dbc
 */

import java.util.Scanner;

public class MaxSumOfRectangleNoLargerThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }
        int k;
        k = sc.nextInt();
        System.out.println(maxSumSubmatrix(matrix, k));
        sc.close();
    }

    public static int maxSumSubmatrix(int[][] matrix, int k) {
        //Write code here
        int ans = Integer.MIN_VALUE;
        int n = matrix.length, m = matrix[0].length;

        // calculating sum column wise
        for (int left = 0; left < m; left++) {
            int[] pref = new int[n]; // every column size is equals to row so taking n
            for (int right = left; right < m; right++) {
                for (int i = 0; i < n; i++)
                    pref[i] += matrix[i][right];
                
                ans = Math.max(ans, getSumK(pref, k));
            }
        }

        return ans;
    }

    private static int getSumK(int[] pref, int k) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < pref.length; i++) {
            int cur_window_sum = 0;
            for (int j = i; j < pref.length; j++) {
                cur_window_sum += pref[j];
                if(cur_window_sum <= k)
                    ans = Math.max(ans, cur_window_sum);
            }
        }

        return ans;
    }
}
