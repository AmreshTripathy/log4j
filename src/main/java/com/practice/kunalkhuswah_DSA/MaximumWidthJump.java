package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=7b5f1f36-e6f6-40e7-a13f-1b27ba29a3bd
 */

import java.util.Scanner;

public class MaximumWidthJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        sc.close();
        System.out.println(solve(nums, n));
        sc.close();
    }

    private static int solve(int[] nums, int n) {
        int maxWidth = 0;

        int[] rMax = new int[n];
        rMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--)
            rMax[i] = Math.max(rMax[i + 1], nums[i]);

        int left = 0;
        int right = 0;

        while (right < n) {
            while (left < right && nums[left] > rMax[right]) {
                left++;
            }
            maxWidth = Math.max(maxWidth, right - left);
            right++;
        }

        return maxWidth;
    }
}
