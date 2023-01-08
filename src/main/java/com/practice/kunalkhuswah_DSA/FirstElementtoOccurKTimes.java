package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FirstElementtoOccurKTimes {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Solution Obj = new Solution();
		firstElementToOccurKTimes(nums, n, k);
	}

	private static void firstElementToOccurKTimes(int[] arr, int n, int k) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
				if(map.get(arr[i]) >= k) {
					System.out.println(arr[i]);
					found = true;
					break;
				}
			} else {
				map.put(arr[i], 1);
				if(k == 1) {
					System.out.println(arr[i]);
					found = true;
					break;
				}
			}
			
		}

//		List<Integer> lis = new ArrayList<Integer>(map.keySet());
//		for (int i = lis.size() - 1; i >= 0; i--) {
//			if (map.get(lis.get(i)) >= k) {
//				System.out.println(lis.get(i));
//				found = true;
//				break;
//			}
//		}

		if (!found) {
			System.out.println(-1);
		}
	}
}
