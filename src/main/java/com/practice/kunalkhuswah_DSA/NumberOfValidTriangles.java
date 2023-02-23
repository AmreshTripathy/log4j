package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=7c49ee78-c709-4c12-94bf-72d53482eb7e
 */

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfValidTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = ValidTriangles(n, arr);
        System.out.println(ans);
    }

    private static int ValidTriangles(int n, int[] arr) {
        // first we sort the array

        Arrays.sort(arr);

        // then we traverse from right to left
        // after fixing one element we are gonna find if there any two element which sum
        // > fixed element
        // the we add the length, because if we check also for between elements the
        // condition will be true

        /*
         * ex: 1 2 2 3 4
         * fix: 4
         * 
         * then check two elements, let's take 1 and 3 -> 1 + 3 > 4 (false)
         * so we increase the left index, 2 + 3 > 4 (true) so count = 4 - 1 = 3
         * then we agin check by doing hi--, 2 + 2 > 4 (fals)
         */

        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int lo = 0;
            int hi = i - 1;

            while (lo < hi) {
                if (arr[lo] + arr[hi] > arr[i]) {
                    count += (hi - lo);
                    hi--;
                } else {
                    lo++;
                }
            }
        }

        return count;
    }
}
