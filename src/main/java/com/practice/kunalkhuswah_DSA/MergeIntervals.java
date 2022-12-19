package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] intervals = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			intervals[i][0] = sc.nextInt();
			intervals[i][1] = sc.nextInt();
		}
		sc.close();
		
		int[][] result = merge(intervals);
		
		System.out.print("[");
		
		for(int[] row: result) {
			System.out.print(Arrays.toString(row));
		}
		

		System.out.print("]");
	}

	private static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		List<List<Integer>> lis = new ArrayList<>();
		
		int left = intervals[0][0];
		int right = intervals[0][1];
		for(int i = 1; i < intervals.length; i++) {
			if(right >= intervals[i][0]) {
				left = Math.min(intervals[i][0], left);
				right = Math.max(intervals[i][1], right);
			}else {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(left);
				temp.add(right);
				lis.add(temp);
				left = intervals[i][0];
				right = intervals[i][1];
			}
		}
		
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(left);
		temp.add(right);
		lis.add(temp);
		
		int[][] result = new int[lis.size()][2];
		
		for(int i = 0; i < result.length; i++) {
			result[i][0] = lis.get(i).get(0);
			result[i][1] = lis.get(i).get(1);
		}
		
		return result;
	}
}
