package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LongestSubArrayWithSumK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        sc.close();
        
        System.out.println(LongestSubArraywithSumK(n,k,nums));
	}

	private static int LongestSubArraywithSumK(int n, int k, int[] nums) {
		int length = 0;
		int sum = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			sum += nums[i];
			if(sum == k)
				length = i + 1;
			else if(map.containsKey(sum - k)) {
				length = Math.max(length, (i - map.get(sum - k)));
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		
		return length;
	}
}
