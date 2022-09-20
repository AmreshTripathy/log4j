package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TwoSum {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static int[] twoSum(int[] nums, int target) {
		
//		int[] sol = new int[2];
//		for(int i=0; i < nums.length; i++) {
//			for(int j = 1; j < nums.length; j++) {
//				if((nums[i] + nums [j]) == target) {
//					if(i != j) {
//						sol[0] = i;
//						sol[1] = j;
//						return sol;
//					}
//				}
//			}
//		}
//		return null;
		
		int[] sol = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				sol[0] = map.get(target-nums[i]);
				sol[1] = i;
				return sol;
			}
			map.put(nums[i], i);
		}
		return sol;
    }
	
	
	public static void main(String[] args) {
		
		String[] entry = sc.nextLine().split(" ");
		int[] nums = new int[entry.length];
		for(int i = 0; i < entry.length ; i++) {
			nums[i] = Integer.parseInt(entry[i]);
		}
		
		int target = sc.nextInt();
		System.out.println(Arrays.toString(twoSum(nums, target)));
		
	}
}
