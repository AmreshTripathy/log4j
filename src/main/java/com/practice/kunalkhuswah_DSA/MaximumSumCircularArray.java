package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3f2d7318-c6e6-4511-be62-2f5a0f8daf8e
 */

import java.util.Scanner;

public class MaximumSumCircularArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        int ans = MaxSum(arr, n);
        System.out.println(ans);
    }

    private static int MaxSum(int[] arr, int n) {
        int max_sum = Integer.MIN_VALUE;
        int cur_max_sum = 0;

        int min_sum = Integer.MAX_VALUE;
        int cur_min_sum = 0;
        
        int wholeArraySum = 0;

        for (int i = 0; i < n; i++) {
            int IfStartNow = arr[i];
            int ifCurrentTrainMAXSum = cur_max_sum + arr[i];

            cur_max_sum = Math.max(IfStartNow, ifCurrentTrainMAXSum);
            max_sum = Math.max(cur_max_sum, max_sum);

            int ifCurrentTrainMINSum = cur_min_sum + arr[i];
            cur_min_sum = Math.min(IfStartNow, ifCurrentTrainMINSum);
            min_sum = Math.min(cur_min_sum, min_sum);

            wholeArraySum += arr[i];
        }

        // if all elements are negative than we need to return maximum subarray sum
        if (wholeArraySum == min_sum)
            return max_sum;

        return Math.max(max_sum, wholeArraySum - min_sum);
    }
}
