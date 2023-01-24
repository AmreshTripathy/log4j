package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=43a06a39-622a-4331-9a4c-62ebfe7bc7ae
 */

import java.util.Scanner;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();
        sc.close();
        int ans = findElement(arr, N, target);

        System.out.println(ans);
    }

    private static int findElement(int[] arr, int n, int target) {
        int lo = 0;
        int hi = n - 1;

        // finding the peak element
        int midVal = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (mid == 0) {
                if(arr[mid] > arr[mid + 1]) {
                    midVal = mid;
                    break;
                }else
                    lo = mid + 1;
            } else if (mid == n - 1) {
                if(arr[mid] > arr[mid - 1]) {
                    midVal = mid;
                    break;
                }else
                    hi = mid - 1;
            } else {
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    midVal = mid;
                    break;
                } else if(arr[mid] > arr[mid - 1])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }

        if(arr[midVal] == target)
            return midVal;

        // checking the element at left
        int ans = -1;
        ans = checkLeftSide(arr, target, midVal - 1);
        // checking the element at right
        if(ans == -1)
            ans = checkRightSide(arr, target, midVal + 1);

        return ans;
    }

    private static int checkLeftSide(int[] arr, int target, int midIndex) {
        int lo = 0;
        int hi = midIndex;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if(arr[mid] == target)
                return mid;
            else if (arr[mid] <= target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

    private static int checkRightSide(int[] arr, int target, int midIndex) {
        int lo = midIndex;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if(arr[mid] == target)
                return mid;
            else if (target >= arr[mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }
}
