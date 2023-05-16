package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a195081f-c4db-4d5f-9fc4-4ccdf4f7fec8
 */

import java.util.Scanner;

public class SearchInARotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), key = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotedBinarySearch(arr, n, key));
        sc.close();
    }

    private static int pivotedBinarySearch(int[] arr, int n, int key) {

        if (n == 1) {
            return (arr[0] == key) ? 0 : -1;
        }

        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] >= arr[lo]) {
                if (arr[lo] <= key && key < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (arr[mid] < key && key <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }
}
