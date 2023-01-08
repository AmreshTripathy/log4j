package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CrissCroosPattern {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();
		
		scanner.close();
		printPattern(rows);

	}

	private static void printPattern(int n) {
		int i, j;
		for (i = n; i >= 1; i--) {

			for (j = i; j < n; j++) {

				System.out.print(" ");// print spaces

			}

			for (j = 1; j <= (2 * i - 1); j++) {

				if (j == 1 || j == (2 * i - 1))// Logic for printing star

					System.out.print(n-i+1);

				else

					System.out.print(" ");// if logic fails print space

			}

			System.out.println("");

		}

		// Lower Inverted V pattern
		int count = n;

		for (i = 2; i <= n; i++) {

			for (j = i; j < n; j++) {

				System.out.print(" ");// Print spaces

			}

			for (j = 1; j <= (2 * i - 1); j++) {

				if (j == 1 || j == (2 * i - 1))// Logic for printing star

					System.out.print(count-1);

				else

					System.out.print(" ");// if logic fails print space

			}
			count--;
			System.out.println("");

		}
	}
}
