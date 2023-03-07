package com.practice.acciojob;

import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();
        sc.close();

        System.out.println(longestOnes(arr, k));
    }

    private static int longestOnes(int[] nums, int k) {
        int len = 0;

        int sp = 0;
        int ep = 0;
        int count = 0;

        while (ep < nums.length) {
            if (nums[ep] == 0)
                count++;

            while (count > k) {
                if (nums[sp] == 0)
                    count--;

                sp++;
            }

            len = Math.max(len, ep - sp + 1);
            ep++;
        }

        return len;
    }
}
