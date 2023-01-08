package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SwitchCaseProblem2 {
	public static void main(String args[]) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {
		case 13:
			System.out.println("I am prime");
			break;

		case 12:
			System.out.println("I am even");
			break;
		case 25:
			System.out.println("I am odd");
			break;
		default:
			System.out.println("I am just a number");
		}
	}
}
