package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SortArrayIncreasingFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		int[] result = frequencySort(arr);
		System.out.print(Arrays.toString(result));
	}
	
	public static int[] frequencySort(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num: nums)
			map.put(num, map.getOrDefault(num, 0) + 1);
		
		List<Integer> lis = new ArrayList<Integer>(map.keySet());
		
		Collections.sort(lis, (a, b) -> map.get(a) == map.get(b) ? (b - a) : map.get(a) - map.get(b));
		
		int[] arr = new int[nums.length];
		int k = 0;
		for(int num: lis) {
			int count = map.get(num);
			while(count-- > 0) {
				arr[k++] = num;
			}
		}
        return arr;
    }
}
