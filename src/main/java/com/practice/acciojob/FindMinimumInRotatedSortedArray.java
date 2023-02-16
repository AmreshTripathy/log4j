package com.practice.acciojob;
/*
 * @Amresh Tripathy
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

    private static int findMin(int[] arr, int low, int high) {
        if(arr[low] <= arr[high])
            return arr[low];

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] > arr[mid + 1])
                return arr[mid + 1];
            else if (arr[mid - 1] > arr[mid])
                return arr[mid];
            else if (arr[low] <= arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
            
        }

        return -1;
    }
}
