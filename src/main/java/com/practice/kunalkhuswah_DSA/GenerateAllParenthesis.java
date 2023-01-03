package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class GenerateAllParenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		generateParanthesis(n);
	}

	private static void generateParanthesis(int n) {
		generate(n, n, "");
	}

	public static void generate(int start, int end, String ans) {
		if (start == 0 && end == 0) {
			System.out.println(ans);
			return;
		}

		if (start < 0 || end < 0)
			return;

		if (end >= start) {
			generate(start - 1, end, ans + "(");
			generate(start, end - 1, ans + ")");
		}
	}
}
