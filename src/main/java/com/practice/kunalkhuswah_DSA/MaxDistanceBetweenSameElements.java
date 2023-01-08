package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaxDistanceBetweenSameElements {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		System.out.println(maxDistance(arr, n));
	}
	
	private static int maxDistance(int[] arr, int n) {
		int max = 0;
		
		List<Integer> lis = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				if(arr[i] == arr[j] && !lis.contains(arr[i])) {
					max = Math.max(max, j - i);
					lis.add(arr[i]);
				}
			}
		}
		
		return max;
	}
}
