package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TypeCasting {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num = (int) 258.64;
		System.out.println(num);
		
//		automatic type promotion in expression
		byte b = (byte) 258;
		System.out.println(b);
		
		b = 40;
		System.out.println(b);
		
		b = 127;
		System.out.println(b);
	
		b = (byte) 128;
		System.out.println(b);
	
		b = (byte) 2580;
		System.out.println(b);
		
		System.out.println(2580 % 256);
		
		
		byte a = 40;
		byte b1 = 50;
		int c = 100;
		System.out.println(a * b1 / c);
		
		a = 'A';
		System.out.println(a);
		
		System.out.println("नमस्ते");
	}
}
