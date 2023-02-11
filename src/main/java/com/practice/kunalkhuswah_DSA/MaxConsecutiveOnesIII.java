package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e40d0a42-b09e-4fc8-9be8-2d5fb508fdad
 * https://leetcode.com/problems/max-consecutive-ones-iii/description/
 */

import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();

        System.out.println(longestOnes(nums, k));
    }

    private static int longestOnes(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        int countZero = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0)
                countZero++;

            while (countZero > k) {
                if(nums[start] == 0)
                    countZero--;
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}