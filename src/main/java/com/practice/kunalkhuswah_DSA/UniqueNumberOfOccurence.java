package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UniqueNumberOfOccurence {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.print(isTrue(arr, n));
	}

	private static boolean isTrue(int[] arr, int n) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i],  1);
		}
		
		List<Integer> lis = new ArrayList<Integer>(map.keySet());
//		Collections.reverse(lis);
		int len = lis.size();
		
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				if(map.get(lis.get(i)) == map.get(lis.get(j))) {
					return false;
				}
			}
		}
		
		return true;
	}
}
