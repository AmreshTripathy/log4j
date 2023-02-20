package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c4eb459b-ea8e-4c06-a898-5d87646be90e
 */

import java.util.Scanner;

public class FindPivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int result = pivotIndex(arr);
        System.out.println(result);
        sc.close();
    }

    public static int pivotIndex(int[] nums) {
        // Write code here

        // calculating left sub array sum
        int[] rightSum = new int[nums.length];
        
        for (int i = rightSum.length - 2; i >= 0; i--)
            rightSum[i] = rightSum[i + 1] + nums[i + 1];

        int leftSum = 0;

        for(int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum - nums[i] == rightSum[i])
                return i;
        }

        return -1;
    }
}
