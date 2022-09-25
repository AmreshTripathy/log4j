package com.practice.kunalkhuswah_DSA;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AddBinary {
	
	protected static Scanner sc = new Scanner(System.in);
	public static String addBinary(String a, String b) {
		
		BigInteger A = new BigInteger(a,2);
		BigInteger B = new BigInteger(b,2);
		
		return ((A.add(B)).toString(2));
    }
	
	public static void main(String[] args) {
		System.out.println(addBinary(sc.next(), sc.next()));
	}
}
