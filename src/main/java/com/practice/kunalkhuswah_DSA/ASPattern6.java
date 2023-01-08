package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ASPattern6 {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int rows = 2 * n + 1;
		
		for(int i = 0; i < rows; i++) {
			if(i < (n+1)) {
				for(int j = n - i -1; j >= 0; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j < i+1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				for(int j = 0; j < i-n; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j <= rows-i-1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
