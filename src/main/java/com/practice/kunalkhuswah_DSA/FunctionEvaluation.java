package com.practice.kunalkhuswah_DSA;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class FunctionEvaluation {
	protected static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		double output = x;
		
		int count = 3;
		for(int i = 1; i < n; i++) {
			if(i % 2 != 0) {
				output -= Math.pow(x, count)/Double.valueOf(factorial(count));
			}else {
				output += Math.pow(x, count)/Double.valueOf(factorial(count));
			}
			count += 2;
		}
		System.out.println(new DecimalFormat("#.########").format(output));
	}
	
	private static int factorial(int i) {
		return (i==0 || i==1) ? 1 : i * factorial(i-1);
	}
}
