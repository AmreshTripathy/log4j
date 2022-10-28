package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LargestNumber {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(isLargestNumber(arr));
	}
	
	private static String isLargestNumber(int[] arr) {
		int n = arr.length;
		String[] str_arr = new String[n];
		for(int i = 0; i < n; i++) {
			str_arr[i] = String.valueOf(arr[i]);
		}
		Arrays.sort(str_arr,(a,b) -> (b+a).compareTo(a+b));
		if(str_arr[0].equals("0"))
			return "0";
		
		StringBuilder sb = new StringBuilder();
		for(String str : str_arr) {
			sb.append(str);
		}
		
		return sb.toString();
	}
}
	
