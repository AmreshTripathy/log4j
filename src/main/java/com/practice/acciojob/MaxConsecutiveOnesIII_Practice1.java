package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 */

import java.util.Scanner;

public class MaxConsecutiveOnesIII_Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();
        sc.close();
        int maxLen = longestOnes(nums, k);
        System.out.println(maxLen);
    }

    private static int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 0;

        int sp = 0, ep = 0;
        int countZero = 0;

        while (ep < n) {
            if (nums[ep] == 0)
                countZero++;

            while (countZero > k) {
                if (nums[sp] == 0)
                    countZero--;

                sp++;
            }

            maxLen = Math.max(maxLen, ep - sp + 1);
            ep++;
        }

        return maxLen;
    }
}
