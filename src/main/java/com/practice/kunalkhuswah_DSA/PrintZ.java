package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PrintZ {
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        PrintZPattern(N);
    }

	private static void PrintZPattern(int n) {
		
		for(int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println();
		for(int i = 1; i < n - 1; i++) {
			for(int j = n-2; j >= i; j--)
				System.out.print(" ");
			System.out.print("*\n");
		}
		
		for(int i = 0; i < n; i++)
			System.out.print("*");
	}
}
