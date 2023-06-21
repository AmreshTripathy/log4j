package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] cost = new int[n];
        for (int i = 0; i < n; i++)
            cost[i] = sc.nextInt();

        sc.close();
        solve(cost, n, m);
    }

    private static void solve(int[] cost, int n, int m) {
        // Arrays.sort(cost);

        // for (int i = 0; i < n; i++) {
        // int index = find(cost, n, m - cost[i]);
        // if (index != -1) {
        // System.out.println((i + 1) + " " + (index + 1));
        // return;
        // }
        // }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cost[i] + cost[j] == m) {

                    System.out.println((i + 1) + " " + (j + 1));
                    break;
                    
                }
            }
        }
    }

    private static int find(int[] cost, int n, int rem) {
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (cost[mid] == rem) {
                return mid;
            } else if (cost[mid] < rem) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return -1;
    }
}
