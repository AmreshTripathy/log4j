package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=534881ae-c8f8-4639-a07f-023ca94000d8
 */

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        sc.close();
        System.out.println(canCompleteCircuit(gas, cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {

        int total_cost = 0, expected_index = 0, sum = 0;
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            sum += (gas[i] - cost[i]);

            if (sum < 0) {
                total_cost += sum;
                sum = 0;
                expected_index = i + 1;
            }
        }

        total_cost += sum;

        return (total_cost >= 0) ? expected_index : -1;
    }
}
