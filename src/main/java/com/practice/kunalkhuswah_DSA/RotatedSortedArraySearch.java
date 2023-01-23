package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9c215979-6be0-4055-8a42-9d20c4b90169
 */

import java.util.Scanner;

public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        sc.close();
        System.out.println(search(A, B));
    }

    public static int search(final int[] a, int target) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] == target)
                return mid;
            else if (a[mid] >= a[lo]) {
                // left array is sorted
                if (a[lo] <= target && target < a[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {
                if (target <= a[hi] && target > a[mid])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}
