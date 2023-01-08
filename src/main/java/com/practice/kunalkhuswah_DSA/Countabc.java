package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Countabc {
	static int CountABC(String str, int i) {
		if (i == str.length() - 2) {
			return 0;
		}

		if (str.substring(i, i + 3).equals("abc") || str.substring(i, i + 3).equals("aba")) {
			return 1 + CountABC(str, i + 1);
		}

		return CountABC(str, i + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(CountABC(s, 0));
	}
}
