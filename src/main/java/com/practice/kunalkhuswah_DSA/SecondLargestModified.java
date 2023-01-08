package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SecondLargestModified {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(removeDuplicates(arr, n));
	}

	private static int removeDuplicates(int[] arr, int n) {
//		if(n == 0) {
//			return 0;
//		}
//		if(n == 1) {
//			return arr[0];
//		}
//		int temp_1;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] > arr[j]) {
//					temp_1 = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp_1;
//				}
//			}
//		}
//		HashSet<Integer> set = new HashSet<Integer>();
//		int count = 0;
//		int[] temp = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			if (i + 1 < n && arr[i] == arr[i + 1] && !set.contains(arr[i])) {
//				temp[count] = arr[i];
//				set.add(arr[i]);
//				i++;
//				count++;
//			} else {
//				if (!set.contains(arr[i])) {
//					temp[count] = arr[i];
//					set.add(arr[i]);
//					count++;
//				}
//			}
//		}
//		if(count<2)
//			return temp[0];
//		return temp[count - 2];
		
		if(n == 0)
			return 0;
		if(n == 1)
			return arr[0];

		int large = -1;
		int large2 = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > large) {
				large2 = large;
				large = arr[i];
			} else if (arr[i] < large && arr[i] > large2) {
				large2 = arr[i];
			}
		}
		return large2;
	}
}
