package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class BillDivision {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int pos = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int charged_amount = sc.nextInt();
		
		System.out.println(overChargedAmount(n, pos, arr, charged_amount));
	}
	
	private static int overChargedAmount(int n, int pos, int[] arr, int charged_amount) {
		int amount = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			if(i != pos) {
				sum += arr[i];
			}
		}
		
		amount = charged_amount - (sum/2);
		return amount;
	}
}
