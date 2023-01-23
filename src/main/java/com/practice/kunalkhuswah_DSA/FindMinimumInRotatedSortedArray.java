package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=629217db-7ed5-4c49-9aff-ed7ecbd251af
 */

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(findMin(arr, 0, n - 1));
    }

    private static int findMin(int arr[], int low, int high) {
        
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid + 1])
                return arr[mid + 1];
            else if (arr[mid  - 1] > arr[mid])
                return arr[mid];
            else if(arr[low] <= arr[mid]) // checking wheher the left side array is sorted or not
                low = mid + 1;
            else
                high = mid - 1;
            
        }
        return -1;
    }
}
