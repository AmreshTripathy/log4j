package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxPointOnAline {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();

		System.out.println(maxPoints(arr));
	}

	private static int maxPoints(int[][] points) {

		// here we are finding slopes and counting it and then counting the number of
		// slopes
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < points.length; i++) {
			Map<Double, Integer> map = new HashMap<Double, Integer>();
			for (int j = i + 1; j < points.length; j++) {
				double slope;
				if (points[i][0] - points[j][0] == 0)
					slope = Double.MAX_VALUE;
				else {
					slope = (points[i][1] - points[j][1]) / (double) (points[i][0] - points[j][0]);
					if(slope == -0.0) slope = 0.0;
				}
				map.put(slope, map.getOrDefault(slope, 0) + 1);
				max = Integer.max(max, map.get(slope));
			}
		}

		return max + 1;
	}

}
