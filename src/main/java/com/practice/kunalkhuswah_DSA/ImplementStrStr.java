package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ImplementStrStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		sc.close();
		System.out.print(indexOf(x, y));
	}

	private static int indexOf(String x, String y) {
		return x.indexOf(y);
	}
}
