package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=51efaeab-1411-48fc-ae36-d2d70cad0edd
 */

import java.util.Scanner;

public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[][] ranges = new int[m][2];
        for (int i = 0; i < m; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        sc.close();
        int[] ans = sumQuery(arr, ranges);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    private static int[] sumQuery(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        build(pref, arr);

        for(int i = 0; i < queries.length; i++) {
            int first = queries[i][0];
            int last = queries[i][1];

            ans[i] = rangeSum(pref, first, last);
        }


        return ans;
    }

    private static int rangeSum(int[] pref, int first, int last) {
        if(first == 0) 
            return pref[last];

        return pref[last] - pref[first - 1];
    }

    private static void build(int[] pref, int[] arr) {

        for (int i = 1; i < arr.length; i++)
            pref[i] = pref[i - 1] + arr[i];
    }
}
