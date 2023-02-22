package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9622e528-95ed-40e3-817b-52f209455545
 * https://www.youtube.com/watch?v=a2dCHUM6Mq4
 */

import java.util.Arrays;
import java.util.Scanner;

public class PairInArrayWithDifferencek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findPairs(a, n, k));
    }

    public static int findPairs(int[] nums, int n, int k) {
        // Write code here
        Arrays.sort(nums);
        int count = 0;

        // taking i = 0 && j = 1 to check the difference one by one
        int i = 0;
        int j = 1;

        while (i < n && j < n && i != j) {
            int diff = nums[j] - nums[i];

            if (diff == k) {
                count++;
                i++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}
