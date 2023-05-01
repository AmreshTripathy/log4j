package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=74a8eec8-e108-4a93-8907-fda51e1e97f2
 */

import java.util.Scanner;

public class NumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int m = sc.nextInt();
        int coins[] = new int[m];
        for (int i = 0; i < m; i++)
            coins[i] = sc.nextInt();
        sc.close();

        System.out.println(minCoins(coins, m, v));
    }

    private static int minCoins(int[] coins, int m, int v) {

        

        return 0;
    }
}
