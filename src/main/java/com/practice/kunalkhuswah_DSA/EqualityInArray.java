package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class EqualityInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(makeUnique(arr, n));
		sc.close();
	}

	private static int makeUnique(int[] arr, int n) {
		
		Arrays.sort(arr);
		int maxCount = 0;
		
		int count = 1;
		for(int i = 0; i < n; i++) {
			if(i+1 < n && arr[i] == arr[i+1]) {
				count++;
			}else {
				if(maxCount < count) {
					maxCount = count;
				}
				count = 1;
			}
		}
		return n-maxCount;
		
	}
}
