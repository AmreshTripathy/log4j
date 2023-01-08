package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LoneElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findOnce(arr, n));
	}

	static int findOnce(int arr[], int n) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			boolean found =false;
			for (int j = 0; j < n; j++) {
				if (i < j && (!set.contains(arr[i]))) {
					if (arr[i] == arr[j]) {
						set.add(arr[i]);
						found = true;
						break;
					}
				}
			}
			if (!found && (!set.contains(arr[i]))) {
				return arr[i];
			}
		}
		return 0;
	}
}
