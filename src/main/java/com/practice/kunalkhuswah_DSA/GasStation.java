package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/gas-station/description/
 */

import java.util.Scanner;

public class GasStation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] gas = new int[n];
		int[] cost = new int[n];
		
		for(int i = 0; i < n; i++) gas[i] = sc.nextInt();
		for(int i = 0; i < n; i++) cost[i] = sc.nextInt();
		
		sc.close();
		System.out.println(canCompleteCircuit(gas, cost));
	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {
		int position = 0, sum = 0, total = 0;

        for(int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if(sum < 0) {
                total += sum;
                sum = 0;
                position = i + 1;
            }
        }

        total += sum;
        
        return (total >= 0) ? position : -1;
	}
}
