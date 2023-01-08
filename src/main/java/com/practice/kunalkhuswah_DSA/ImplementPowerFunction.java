package com.practice.kunalkhuswah_DSA;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ImplementPowerFunction {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long x = sc.nextLong();
		long y = sc.nextLong();
		long d = sc.nextLong();
		
		long z = power(x,y);
		
		System.out.print(z % d);
	}
	
	private static long power(long x, long y) {
		if(y == 0) {
			return 1;
		}else if(y  % 2 == 0) {
			return power(x, y / 2) * power(x, y / 2);
		}else {
			return x * power(x, y / 2) * power(x, y / 2);
		}
	}
}
