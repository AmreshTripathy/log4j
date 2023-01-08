package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class MarcCakewalk {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		long miles = 0;
		for(int i = n-1; i >= 0 ; i--) {
			miles += arr[i] * (Math.pow(2,n-i-1));
		}
		
		System.out.println(miles);
	}
}
