package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=394beaf0-a22e-4e5d-81ca-9b29ea03f57e
 */

import java.util.Scanner;

public class CarPooling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] trips = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                trips[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(carPooling(trips, k));
    }

    private static boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1005];

        for(int i = 0; i < trips.length; i++) {
            int numOfPass = trips[i][0];
            int sp = trips[i][1];
            int ep = trips[i][2];

            stops[sp] += numOfPass;
            stops[ep + 1] -= numOfPass;
        }

        for(int i = 1; i < 1005; i++) {
            stops[i] = stops[i] + stops[i - 1];
            if (stops[i] > capacity)
                return false;
        }

        return true;
    }
}
