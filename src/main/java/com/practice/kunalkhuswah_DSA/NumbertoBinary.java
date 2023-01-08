package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class NumbertoBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printBinary(n);
	}

	private static void printBinary(int n) {
		
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append(n % 2);
			n /= 2;
		}
		System.out.print(sb.reverse());
	}
}
