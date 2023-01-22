package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=5a206680-d1df-4e82-8196-dd13f35ba139
 */

import java.util.Scanner;

public class FindFirstandLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        findPosition(nums, n, k);
        sc.close();
    }

    private static void findPosition(int[] nums, int n, int k) {
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == k) {
                int start = findStartIndex(nums, lo, mid);
                int end = findEndIndex(nums, mid, hi);
                System.out.print(start + " " + end);
                return;
            } else if (nums[mid] < k)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        System.out.println("-1 -1");
    }

    private static int findStartIndex(int[] nums, int lo, int mid) {
        int temp = mid;
        while (temp >= lo) {
            if (nums[temp - 1] != nums[temp])
                break;
            temp--;
        }
        return temp;
    }

    private static int findEndIndex(int[] nums, int mid, int hi) {
        int temp = mid;
        while (temp <= hi) {
            if (nums[temp + 1] != nums[temp])
                break;
            temp++;
        }
        return temp;
    }

}
