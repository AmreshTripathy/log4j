package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2b47cc50-0795-4f02-83ff-53438d39a9df
 */

import java.util.Scanner;

public class XORQueriesOfASubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[] result = xorQueries(arr, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] xorQueries(int[] A, int[][] queries) {
        int[] pref = new int[A.length];
        int[] ans = new int[queries.length];

        // building prefix of xor elements
        pref[0] = A[0];
        for (int i = 1; i < A.length; i++)
            pref[i] = pref[i - 1] ^ A[i];

        for (int i = 0; i < queries.length; i++) {
            int sp = queries[i][0];
            int ep = queries[i][1];

            if (sp == 0)
                ans[i] = pref[ep];
            else
                ans[i] = pref[ep] ^ pref[sp - 1];
        }

        return ans;
    }
}