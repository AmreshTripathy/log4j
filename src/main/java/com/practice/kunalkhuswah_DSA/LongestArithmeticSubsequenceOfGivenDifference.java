package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LongestArithmeticSubsequenceOfGivenDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int difference = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();

		System.out.println(longestSubsequence(arr, difference));
	}

	public static int longestSubsequence(int[] arr, int difference) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 1;

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i] - difference, 0) + 1);
            max = Math.max(max, map.get(arr[i]));
        }

        return max;
//		return longSubsequence(arr, difference, 0, new ArrayList<Integer>(), 0);
	}

	public static int longSubsequence(int[] arr, int k, int index, List<Integer> lis, int max) {
		if (index <= arr.length && !lis.isEmpty()) {
			max = Math.max(max, lis.size());
		}

		if (index == arr.length) {
			return max;
		}

		for (int i = index; i < arr.length; i++) {
			if (lis.isEmpty()) {
				lis.add(arr[i]);
				max = longSubsequence(arr, k, i + 1, lis, max);
				lis.remove(lis.size() - 1);
			} else if ((arr[i] - lis.get(lis.size() - 1) == k)) {
				lis.add(arr[i]);
				max = longSubsequence(arr, k, i + 1, lis, max);
				lis.remove(lis.size() - 1);
			}
		}

		return max;
	}
}
