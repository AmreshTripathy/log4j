package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8dda6267-a0e8-4d9f-89ce-30b41215dbbb
 */

import java.util.Scanner;

public class ShippingParcels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        minShippingWeight(array, n, D);
    }

    private static void minShippingWeight(int[] a, int n, int D) {

        // finding the sum of all weights and max weight

        int lo = 0;
        int hi = 0;

        for (int weight : a) {
            lo = Math.max(lo, weight);
            hi += weight;
        }

        // Use Binary Search Approach to find optimal weight to transport packages in d
        // days
        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (isPossibleToShip(a, n, D, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(ans);

    }

    private static boolean isPossibleToShip(int[] a, int n, int d, int capacity) {
        int shipped = 1;
        int sum = 0;

        for (int weight : a) {
            if ((sum + weight) <= capacity) {
                sum += weight;
            } else {
                shipped++;
                sum = weight;
            }
        }

        return shipped <= d;
    }
}
