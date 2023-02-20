package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=4265d603-e34e-4d86-84e8-0ce3c938c197
 */

import java.util.Scanner;

public class MaximumContiguousSubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        input.close();
        long ans = maxSubarraySum(a,n);
        System.out.println(ans);
    }

    private static long maxSubarraySum(int[] a, int n) {

        // Using Kadanes Algorithm
        long maxSum = Integer.MIN_VALUE;
        long cur_train = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long ifStartWithNewTrain = a[i];
            long ifStartWithCurrentTrain = cur_train + a[i];

            cur_train = Math.max(ifStartWithNewTrain, ifStartWithCurrentTrain);
            maxSum = Math.max(cur_train, maxSum);
        }

        return maxSum;
    }
}
