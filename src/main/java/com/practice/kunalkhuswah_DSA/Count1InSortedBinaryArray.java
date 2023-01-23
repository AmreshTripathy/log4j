package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=98e9bbba-6f59-4585-a38c-6f9bd3cd972a
 */

import java.util.Scanner;

public class Count1InSortedBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        sc.close();
        System.out.println(count1(n,array));
    }

    private static int count1(int size, int[] arr) {
        int lo = 0;
        int hi = size - 1;
        // 1 1 1 1 0 0 -> sorted decreasing order containing only 0s and 1s
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if(arr[mid] < 1)
                hi = mid - 1;
            else if(arr[mid] > 1)
                lo = mid + 1;
            else {
                if(mid == size - 1 || arr[mid + 1] != 1) // returning the last index of 1
                    return mid + 1;
                else
                    lo = mid + 1;
            }
        }
        return 0;
    }
}
