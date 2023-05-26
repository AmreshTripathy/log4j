package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Diagonal_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				System.out.print(" ");
			System.out.println("*");
		}
    }
}
