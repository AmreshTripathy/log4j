package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PrintFromXtoYRecurssively {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		printXandY(x,y);
	}

	private static void printXandY(int x, int y) {
		if(x > y) {
			return;
		}
		System.out.print(x + " ");
		printXandY(x+1, y);
	}
}
