package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class TowerOfHanoi {
	private static void towersOfHanoi(int n, char source, char dest, char aux) {
		if (n == 1) {
			System.out.println("Moving ring 1 from " + source + " to " + dest);
			return;
		}

		towersOfHanoi(n - 1, source, aux, dest);
		System.out.println("Moving ring " + n + " from " + source + " to " + dest);
		towersOfHanoi(n - 1, aux, dest, source);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		towersOfHanoi(n, 'A', 'B', 'C'); // move n disks from A to B
	}
}
