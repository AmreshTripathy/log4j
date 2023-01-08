package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class JesseAndCookies {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.print(processes(arr, n, k));
	}

	private static int processes(int[] arr, int n, int k) {
		int process = 0;
//		int[] arr_cur;
		Arrays.sort(arr);
		while (arr[0] < k && arr[1] < k) {
			int[] cur = new int[n - process -1];
			int eqn = (1 * arr[0]) + (2 * arr[1]);
			cur[0] = eqn;
			for (int j = 2; j < n-process; j++) {
				cur[j - 1] = arr[j];
			}
			Arrays.sort(cur);
			arr = cur.clone();
			process++;
		}

		return process == 0 ? -1 : process;
	}
}
