package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=24317ca0-60e5-4823-9108-e0edfd4e3f08
 */

import java.util.Scanner;

public class MinimumLimitOfBallsInABag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        input.close();
        System.out.println(solve(n, m, arr));
    }

    private static int solve(int n, int m, int[] arr) {
        
        // if infinite operations, we can devide all balls to separate bags, hence max in a bag will be 1
        int lo = 1;

        // if you have zero operations, the max in a bag is max in the array of bags
        int hi = arr[0];

        for (int i = 1; i < n; i++)
            hi = Math.max(hi, arr[i]);

        int res = 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if(isPossible(n, arr, m, mid) == true) {
                res = mid;
                hi = mid - 1;
            }else
                lo = mid + 1;
        }

        return res;
    }

    private static boolean isPossible(int n, int[] arr, int m, int mid) {
        int currOpOpt = 0;
        // hello fadff
        return false;
    }
}
