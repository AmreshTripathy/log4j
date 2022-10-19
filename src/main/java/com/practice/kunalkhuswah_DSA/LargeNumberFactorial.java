package com.practice.kunalkhuswah_DSA;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LargeNumberFactorial {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}
	private static BigInteger factorial(int n) {
		BigInteger fact = BigInteger.ONE;
		
		for(int i = n; i > 1; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		return fact;
	}
}
