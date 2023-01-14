package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=864309e9-49cf-4bd9-b2a5-1fa5989e3cf9
 */

public class FindHingedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(findElement(arr, n));
    }

    private static int findElement(int[] arr, int n) {

        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;

        // created an leftMax array to calculate left max of the array element
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i - 1], leftMax[i - 1]);
        }

        int rightMin = Integer.MAX_VALUE;

        // here we are checking right wise and cheking whther leftMax[i] < arr[i] && arr[i] < rightMin
        for(int i = n - 1; i >= 0; i--) {
            if(leftMax[i] < arr[i] && arr[i] < rightMin)
                return i;

            rightMin = Math.min(rightMin, arr[i]);
        }

        return -1;
    }
}
