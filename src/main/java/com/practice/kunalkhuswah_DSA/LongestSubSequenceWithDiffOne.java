package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LongestSubSequenceWithDiffOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();

		System.out.println(longSubsequence(arr));
//		System.out.println(longestSubsequence(arr, 0, new ArrayList<Integer>(), 1));
	}

	private static int longSubsequence(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 1;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1) && map.containsKey(arr[i] + 1)) {
				flag = true;
				map.put(arr[i], Math.max(map.get(arr[i] - 1), map.get(arr[i] + 1)) + 1);
			} else if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], map.get(arr[i] - 1) + 1);
				flag = true;
			}

			else if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i], map.get(arr[i] + 1) + 1);
				flag = true;
			}

			else if (!map.containsKey(arr[i]))
				map.put(arr[i], 0);

			max = Math.max(max, map.get(arr[i]));
		}

		return (flag) ? max + 1 : 1;
	}

	public static int longestSubsequence(int[] arr, int index, List<Integer> lis, int max) {
		if (index == arr.length) {
			max = Math.max(max, lis.size());
			return max;
		}

		for (int i = index; i < arr.length; i++) {
			if (lis.isEmpty()) {
				lis.add(arr[i]);
				max = longestSubsequence(arr, i + 1, lis, max);
				lis.remove(lis.size() - 1);
			}
			if (!lis.isEmpty() && Math.abs(arr[i] - lis.get(lis.size() - 1)) == 1) {
				lis.add(arr[i]);
				max = longestSubsequence(arr, i + 1, lis, max);
				lis.remove(lis.size() - 1);
			}
		}

		return max;
	}
}
