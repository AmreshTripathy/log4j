package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=12a72266-1582-45fe-9d30-db3a1a0b710e
 */

import java.util.Scanner;

public class FloorInASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(floorInSortedArray(arr, n, k));
    }

    private static int floorInSortedArray(int[] arr, int n, int k) {
        int lo = 0;
        int hi = n - 1;

        int pre = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if(arr[mid] == k)
                return mid;
            else if(arr[mid] <= k) {
                pre = mid;
                lo = mid + 1;
            }else
                hi = mid - 1;
        }

        return pre;
    }
}
