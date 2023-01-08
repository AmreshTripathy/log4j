package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CompositeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		printOnlyPrimeNumbers(arr, n);
		sc.close();
	}

	private static void printOnlyPrimeNumbers(int[] arr, int len) {
		for(int i = 0; i < len; i++) {
			if(isPrime(arr[i]))
				System.out.print(arr[i] + " ");
		}
	}

	private static boolean isPrime(int n) {
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
