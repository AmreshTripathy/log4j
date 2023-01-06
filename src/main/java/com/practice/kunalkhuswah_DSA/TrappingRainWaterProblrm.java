package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TrappingRainWaterProblrm {
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
		int[] leftMax = leftMaxArray(arr, n);// finding left max for every element
		int[] rightMax = rightMaxArray(arr, n);// finding right max for every element

		int units = 0;
		for(int i = 0; i < n; i++) {
			units += Integer.min(leftMax[i], rightMax[i]) - arr[i];
		}
		System.out.println(units);
	}

	private static int[] leftMaxArray(int[] arr, int n) {
		int[] leftMax = new int[n];

		leftMax[0] = arr[0];

		for (int i = 1; i < n; i++) {
			leftMax[i] = Integer.max(leftMax[i - 1], arr[i]);
		}

		return leftMax;
	}

	private static int[] rightMaxArray(int[] arr, int n) {
		int[] rightMax = new int[n];

		rightMax[n  - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Integer.max(rightMax[i + 1], arr[i]);
		}

		return rightMax;
	}
}
