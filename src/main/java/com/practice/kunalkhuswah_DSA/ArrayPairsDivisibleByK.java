package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=dfd243c0-23e1-4628-b227-5e38da625207
 */

public class ArrayPairsDivisibleByK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		if (arrayPairs(arr, k)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

	public static boolean arrayPairs(int[] arr, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int rem = arr[i] % k;
			if (rem < 0) {
				rem = k + rem;
			}
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}

		if (map.containsKey(0)) {
			if (map.get(0) % 2 != 0)
				return false;
			map.remove(0);
		}

		for (int n : map.keySet()) {
			int rem = n;
			int x = map.getOrDefault(k - rem, 0);
			int y = map.get(rem);
			if (x != y)
				return false;
		}
		return true;
	}
}
