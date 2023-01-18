package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=fc5f657f-bf71-49c6-890c-96a5835f684b
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */

import java.util.Scanner;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        sc.close();

        System.out.println(peakIndexInMountainArray(A));
    }

    private static int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2; // finding mid point of array

            if (mid == 0) {
                // if mid is 0 there are no left side array available so mid point is 
                // either mid or increase by one
                if(A[mid] > A[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            } else if (mid == A.length - 1) {
                // if mid is same as  A.length, so there are no right side array available so mid point is 
                // either mid or decrease by one
                if(A[mid] > A[mid - 1])
                    return mid;
                else
                    high = mid - 1;
            } else {
                if(A[mid] > A[mid - 1] && A[mid] > A[mid + 1])
                    return mid;
                else if (A[mid] >= A[mid - 1])
                    low = mid + 1;
                else 
                    high = mid - 1;
            }
        }

        return -1;
    }
}
