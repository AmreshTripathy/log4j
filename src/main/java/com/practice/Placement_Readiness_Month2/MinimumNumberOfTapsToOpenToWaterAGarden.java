package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/
 */

import java.util.Scanner;

public class MinimumNumberOfTapsToOpenToWaterAGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ranges = new int[n];

        for (int i = 0; i < n; i++)
            ranges[i] = sc.nextInt();

        sc.close();

        System.out.println(minTaps(n, ranges));
    }

    private static int minTaps(int n, int[] ranges) {

        int min = 0;
        int max = 0;
        int open = 0;

        while (max < n) {
            for (int i = 0; i < n; i++) {
                if (i - ranges[i] <= min && max < i + ranges[i])
                    max = i + ranges[i];
            }

            if (min == max)
                return -1;
            // to find next max we need to change min equal to max
            min = max;
            open++;
        }

        return open;
    }
}
