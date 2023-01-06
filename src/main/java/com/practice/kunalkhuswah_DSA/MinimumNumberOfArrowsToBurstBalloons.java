package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MinimumNumberOfArrowsToBurstBalloons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] points = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(findMinArrowShots(points));
	}
	
	private static int findMinArrowShots(int[][] points) {
		
		// https://www.youtube.com/watch?v=Z9o-lqwgSWA
		
		Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
		
		int count = 1;
		
		for(int i = 0; i < points.length - 1; i++) {
			for(int j = i + 1; j < points.length; j++) {
				if(points[j][0] > points[i][1]) { // checking x index value is not less or equal from ith y point
					count++;
					i = j - 1;
					break;
				}
			}
		}
		
		return count;
	}
}
