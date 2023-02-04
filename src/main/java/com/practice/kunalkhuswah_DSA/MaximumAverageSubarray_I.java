package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e7dcf084-25db-4c64-8e66-fb8d29cfce6e
 */

import java.util.Scanner;

public class MaximumAverageSubarray_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.printf("%.5f", findMaxAverage(arr, k));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++)
            sum += nums[i];

        max = sum;
        for(int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum);
        }

        return Double.valueOf(max) / k;
    }
}
