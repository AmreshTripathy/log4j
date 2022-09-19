package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class Prime {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		long num = sc.nextLong();
		boolean notPrime = false;
		long c = 2;
		while(c < num) {
			if(num % c == 0) {
				notPrime = true;
				System.out.println(num + " is not prime");
				break;
			}else {
				c++;
			}
		}
		if (!notPrime && num != 1)
			System.out.println(num + " is prime");
		if(num == 1)
			System.out.println("1 is a Natural number can not be called as a prime number");
	}
}
