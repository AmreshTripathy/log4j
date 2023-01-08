package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ASPatternProblem3 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		char x = sc.next().charAt(0);
        bjgeneratePattern(x);
	}

	private static void bjgeneratePattern(char x) {
		int n = x - 65 + 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < x-65+1; j++) {
				System.out.print(x + " ");
			}
			x--;
			System.out.println();
		}
		
	}
}
