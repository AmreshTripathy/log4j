package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LastTwoDigitOfFibonacciSeries {
	
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		int[] fibonacci_series = new int[300];
		
		fibonacci_series[0] = 0;
		fibonacci_series[1] = 1;
		
		for(int i = 2; i < 300; i++) {
			fibonacci_series[i] = (fibonacci_series[i-1] + fibonacci_series[i-2]) % 100;
		}
		
		System.out.println(String.format("%02d", fibonacci_series[n % 300]));
		
	}
}
