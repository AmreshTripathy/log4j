package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6b0355db-2e09-4afa-8be4-045d710113fb
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraySumDivisibleByK {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(sumDivisibleByK(arr, n, k));
		System.out.println(sumDivisibleByKUsingHashMap(arr, n, k));
	}
	
	private static int sumDivisibleByKUsingHashMap(int[] arr, int n, int k) {
		int count = 0;
		// using reminder and that's count 
		// if it comes second time we got a sub array then count + 1
		// arr : 4	  5		0		-2		-3		1 	// k = 5;
		// sum : 4	  9		9		7		4		5
		// adding (0,1) to map  so we can add it in count if it comes again
		// map : 4,1  4,2	4,3		2,1		4,4		0,2
		// count:		1	2				3		1 (adding previous frequency of the repeating number)
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;

		for(int i = 0; i < n; i++) {
			sum += arr[i];
			int rem = sum % k;
			if(rem < 0)
				rem += k;
			if(map.containsKey(rem))
				count += map.get(rem);

			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}

		return count;
	}

	private static int sumDivisibleByK(int[] arr, int n, int k) {
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = i; j < n; j++) {
				sum += arr[j];
				if(sum % k == 0)
					count++;
			}
		}
		
		return count;
	}

	// using hash map Approach
}
