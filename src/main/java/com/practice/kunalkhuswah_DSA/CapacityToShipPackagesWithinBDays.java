package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ea8f08aa-d041-4639-a8c6-d3235d8bd34f
 */

import java.util.Scanner;

public class CapacityToShipPackagesWithinBDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        sc.close();
        System.out.println(solve(A, B));
    }

    private static long solve(int[] A, int B) {

        // minimum capacity of ship is when good is taken indivually so, max capacity at
        // that moment is max weight of good available
        // minimum capacity of ship is when good when all goods are taken in same day,
        // is sum of weight of all the goods
        long lo = 0;
        long hi = 0;

        for (int i = 0; i < A.length; i++) {
            lo = Math.max(lo, A[i]);
            hi += A[i];
        }

        long ans = -1;

        while (lo <= hi) {
            long mid = (lo + hi) / 2;

            // if it is possible to trasport goods with this maxCapacity to port 1 to port 2
            // within B days, so this is your potential ans and now try for smaller max
            // capacity
            if (posiibleToShip(A, B, mid) == true) {
                ans = mid;
                hi = mid - 1;
            }
            // maxCapacity for ship is less to transport goods from port 1 to port 2 within
            // B days, so increase maxCapacity hence move right 
            else
                lo = mid + 1;
        }

        return ans;
    }

    private static boolean posiibleToShip(int[] a, int b, long cap) {
        int shipped = 1;
        long sum = 0;

        for (int weight : a) {
            if (sum + weight <= cap)
                sum += weight;
            else {
                shipped++;
                sum = weight;
            }
        }
        return shipped <= b;
    }
}
