package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintPattern {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int temp = n;
		boolean minus = false;
		print(n, minus, temp);
	}
	private static void print(int n, boolean minus, int temp) {
		System.out.print(n + " ");
		
		if(n > 0 && !minus) {
			print(n-5, minus, temp);
		}else if(temp != n){
			minus = true;
			print(n+5, minus, temp);
		}
		
	}
}