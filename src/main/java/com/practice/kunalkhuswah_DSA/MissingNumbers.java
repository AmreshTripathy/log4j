package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int brr[] = new int[m];
		for (int i = 0; i < m; i++) {
			brr[i] = sc.nextInt();
		}

		sc.close();
		missingNumbers(n, arr, m, brr);
	}

	static void missingNumbers(int n, int arr[], int m, int brr[]) {
		Map<Integer, Integer> map_1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map_2 = new HashMap<Integer, Integer>();

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
			map_1.put(arr[i], map_1.getOrDefault(arr[i], 0) + 1);
		}

		for (int i = 0; i < m; i++) {
			set.add(brr[i]);
			map_2.put(brr[i], map_2.getOrDefault(brr[i], 0) + 1);
		}

		List<Integer> lis = new ArrayList<Integer>(map_2.keySet());
		Collections.sort(lis);
		boolean flag = false;
		for (int num : lis) {
			if (map_1.containsKey(num)) {
				if (map_1.get(num) != map_2.get(num)) {
					flag = true;
					System.out.print(num + " ");
				}
			} else {
				flag = true;
				System.out.print(num + " ");
			}
		}

		if (!flag)
			System.out.println(-1);
	}
}