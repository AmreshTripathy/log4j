package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class ReverseInteger {

	static Scanner sc = new Scanner(System.in);

	public static int reverse(int x) {
//		if (x == 0)
//			return 0;
//		long reverse = 0;
//		while (x != 0) {
//			int last_digit = x % 10;
//			reverse = reverse * 10 + last_digit;
//			x = x / 10;
//		}
////    System.out.println(reverse);
//
//		if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
//			return 0;
//		} else
//			// System.out.println((int)reverse);
//			return (int) reverse;

		Stack<Integer> rev_int = new Stack<Integer>();

		while (x != 0) {
			rev_int.push(x % 10);
			x /= 10;
		}

		int num = 0;
		int count = 1;

		while (rev_int.size() > 0) {
			num += rev_int.pop() * count;
			count *= 10;
		}

		if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
			return 0;
		} else
			return (int) num;
	}

	public static void main(String[] args) {
		System.out.println(reverse(sc.nextInt()));
	}

}
