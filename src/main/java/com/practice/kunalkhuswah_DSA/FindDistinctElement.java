package com.practice.kunalkhuswah_DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @Amresh Tripathy
 */

public class FindDistinctElement {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int M[][] = new int[N][N];
		String arr[] = in.readLine().trim().split("\\s+");
		for (int i = 0; i < N * N; i++)
			M[i / N][i % N] = Integer.parseInt(arr[i]);

		printMatrix(M, N);

		System.out.println(distinct(M, N));
	}

	private static int distinct(int[][] m, int n) {
		int count = 0;

		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();

		for (int i = 0; i < n; i++) {
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < n; j++) {
				set.add(m[i][j]);
			}
			map.put(i, set);
		}

		Set<Integer> set = map.get(0);

		for (int i : set) {
			boolean presentInAllSet = false;
			for (int j : map.keySet()) {
				if (j != 0) {
					if (map.get(j).contains(i)) {
						presentInAllSet = true;
					}else {
						presentInAllSet = false;
						break;
					}
				}
			}
			if(presentInAllSet)
				count++;
		}

		return count;
	}

	private static void printMatrix(int[][] mat, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
