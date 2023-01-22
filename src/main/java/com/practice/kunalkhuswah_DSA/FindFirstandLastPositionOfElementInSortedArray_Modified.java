package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=5a206680-d1df-4e82-8196-dd13f35ba139
 */

import java.util.Scanner;

public class FindFirstandLastPositionOfElementInSortedArray_Modified {
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
        int first = findStartIndex(nums, n, k);
        int last = findEndIndex(nums, n, k);

        System.out.print(first + " " + last);
    }

    private static int findStartIndex(int[] nums, int n, int k) {
        int fi = -1;

        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] == k) {
                fi = mid;
                hi = mid - 1;
            }else if(nums[mid] < k)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return fi;
    }

    private static int findEndIndex(int[] nums, int n, int k) {
        int la = -1;

        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] == k) {
                la = mid;
                lo = mid + 1;
            }else if(nums[mid] < k)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return la;
    }
}
