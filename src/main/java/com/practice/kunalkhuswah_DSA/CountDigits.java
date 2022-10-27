package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CountDigits {
	protected static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(Integer.toString(arr[i]).length() % 2 != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
