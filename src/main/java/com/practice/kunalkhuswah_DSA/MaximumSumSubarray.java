package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8bff3159-40be-4f88-92f0-5c844894b12e
 */

import java.util.Scanner;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr));
    }

    // Function Call
    static int maxSubArraySum(int nums[]) {
        // your code here
        long cur_sum = Integer.MIN_VALUE;
        long max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            long ifTakeNewElement = nums[i];
            long ifTakeCurrentSum = cur_sum + nums[i];

            cur_sum = Math.max(ifTakeNewElement, ifTakeCurrentSum);
            max_sum = Math.max(cur_sum, max_sum);
        }

        return (int) max_sum;
    }
}
