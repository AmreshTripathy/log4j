package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/contains-duplicate-ii
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		System.out.print(containsNearbyDuplicate(nums, k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
