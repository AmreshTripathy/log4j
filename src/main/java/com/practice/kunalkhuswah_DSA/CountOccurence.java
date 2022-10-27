package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CountOccurence {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(countNumbers(arr, n));
		
	}
	
	private static String countNumbers(int[] arr, int n) {
		
		Arrays.sort(arr);
		String str = "";
		List <Integer> lis = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n && !lis.contains(arr[i]); j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(!lis.contains(arr[i])) {
				lis.add(arr[i]);
				str += " "+count;
			}
		}
		return str.trim();
	}
}
