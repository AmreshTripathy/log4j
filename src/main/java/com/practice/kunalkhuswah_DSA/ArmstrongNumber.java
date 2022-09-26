package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ArmstrongNumber {
	
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num = sc.nextInt();
		int num1 = num;
		double sum = 0;
		
		while(num1>0) {
			sum += Math.pow(num1%10, 3);
			num1 = num1/10;
		}

		if(sum == num) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
}
