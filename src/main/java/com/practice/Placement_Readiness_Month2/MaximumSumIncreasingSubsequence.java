package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=0b03e067-3da8-4e11-a804-2d333a4bb050
 */

import java.io.IOException;
import java.util.Scanner;

public class MaximumSumIncreasingSubsequence {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }
        System.out.println(maxSumIncreasingSubsequence(n, array));
        sc.close();
    }

    static int maxSumIncreasingSubsequence(int n, int arr[]) {
        // code here
        int i, j, max = 0;
        int msis[] = new int[n];

        /*
         * Initialize msis values
         * for all indexes
         */
        for (i = 0; i < n; i++)
            msis[i] = arr[i];

        /*
         * Compute maximum sum values
         * in bottom up manner
         */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] &&
                        msis[i] < msis[j] + arr[i])
                    msis[i] = msis[j] + arr[i];

        /*
         * Pick maximum of all
         * msis values
         */
        for (i = 0; i < n; i++)
            if (max < msis[i])
                max = msis[i];

        return max;
    }
}
