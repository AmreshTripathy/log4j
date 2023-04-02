package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=309bfcb0-7e3b-4d83-8c09-68372782fb48
 */

import java.util.Scanner;

public class MinimumCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int m = coins.length;
        int V = sc.nextInt();
        sc.close();
        System.out.println(minCoins(coins, m, V));
    }

    private static int minCoins(int[] coins, int m, int v) {

        int count = 0;
        m = m - 1;

        while (v > 0) {
            if (v >= coins[m]) {
                v -= coins[m];
                count++;
            } else {
                m -= 1;
            }
        }

        return count;
    }
}
