package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PrintContiguousSubArrayRecurssively {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        sc.close();
        
        printSubArrays(nums, 0);
	}

	private static void printSubArrays(int[] nums, int i) {
		if(i == nums.length)
			return;
		
		String arr = "";
		
		for(int j = i; j < nums.length; j++) {
			arr += nums[j] + " ";
			System.out.print("[ "+ arr + " ]");
		}
		System.out.println();
		printSubArrays(nums, i + 1);
	}
}
