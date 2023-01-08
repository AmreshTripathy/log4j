package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class TrappingRainWaterProblrm_WithStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();

		TappingWater(arr, n);
	}

	public static void TappingWater(int[] arr, int n) {
		
	}
}
