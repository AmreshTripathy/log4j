package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2da7ad22-cccc-497d-864c-a3ea784e1263
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlidingWindowMaximum_Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = SlidingWindowMaximum(n, k, nums);
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] SlidingWindowMaximum(int n, int k, int[] arr) {

        List<Integer> lis = new ArrayList<>();

        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            lis.add(max);
        }

        int[] ans = new int[lis.size()];

        for (int i = 0; i < lis.size(); i++)
            ans[i] = lis.get(i);

        return ans;
    }
}
