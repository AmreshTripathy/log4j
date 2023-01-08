package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RelativeSortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		for (int i = 0; i < n; i++)
			arr1[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			arr2[i] = sc.nextInt();

		sc.close();
		System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr1.length; i++)
			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
		int k = 0;
		for(int i = 0; i < arr2.length; i++) {
			int count = map.get(arr2[i]);
			while(count-- > 0) {
				arr1[k++] = arr2[i];
			}
			map.remove(arr2[i]);
		}
		
		if(!map.isEmpty()) {
			List<Integer> lis = new ArrayList<Integer>(map.keySet());
			Collections.sort(lis);
			for(int num: lis) {
				int count = map.get(num);
				while(count-- > 0) {
					arr1[k++] = num;
				}
				map.remove(num);
			}
		}
		
		return arr1;
	}
}
