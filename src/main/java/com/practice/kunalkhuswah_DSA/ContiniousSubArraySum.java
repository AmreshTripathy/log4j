package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContiniousSubArraySum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(longestLength(arr, k));
	}
	
	private static boolean longestLength(int[] nums, int k) {
		int sum = 0; // prefix sum of 0 elements.

        Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();

        set.add(sum);
        map.put(sum, 0); // it takes 0 elements to have sum % k == 0

        for (int i = 0; i < nums.length; i ++) {
			sum += nums[i]; // increase the sum with next element
            int val = sum % k;
			if (!set.contains(val)) { // if this mod has never came before
				set.add(val); // store the mod
				map.put(val, i + 1); // update the map to store mod and number of elements it took to reach this.
			}
			else {
				if ((i + 1) - map.get(val) >= 2) // otherwise check if the distance between previous occurance and this one is greater than 1.
					return true; // if so, then return true.
			}
		}

		return false; // other wise false.
	}
}
