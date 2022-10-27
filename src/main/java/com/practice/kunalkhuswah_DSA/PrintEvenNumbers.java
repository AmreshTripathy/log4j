package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintEvenNumbers {
	
	protected static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		
		int n=sc.nextInt();
		for(int i = 0; i <= n; i = i + 2)
	          System.out.print(i + " ");
	}
}
