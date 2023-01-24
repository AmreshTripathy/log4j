package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2665b43f-7632-47bd-83ae-eaca271efc3c
 */

import java.util.Arrays;
import java.util.Scanner;

public class AggresiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(aggressiveCows(nums, k));
    }

    private static int aggressiveCows(int[] a, int cows) {
        // sorting the position so that we have clear picture of which cow has threat
        // from which cow, as cow at
        // postion x will be more prone to agression with cow at position near to that x
        Arrays.sort(a);

        // minimum distance between two stll is 1 so low = 1
        int lo = 1;
        // maximum distance between two stall is difference between minimum element and
        // maximum element
        int hi = a[a.length - 1] - a[0];

        int res = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (posibleToPlace(a, mid, cows) == true) {
                res = mid;
                // checking if it is applicable to bigger capacity
                lo = mid + 1;
            } else
                hi = mid - 1;
        }

        return res;
    }

    private static boolean posibleToPlace(int[] a, int minDist, int cows) {
        // every first cow we need to place at first position
        int cowPlaced = 1;
        int lastPositionPlaced = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] - lastPositionPlaced >= minDist) {
                cowPlaced++;
                lastPositionPlaced = a[i];
            }
        }

        return cowPlaced >= cows;
    }
}
