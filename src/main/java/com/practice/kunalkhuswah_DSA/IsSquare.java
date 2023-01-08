package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class IsSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		sc.close();
		double first = Math.sqrt((Math.pow(x1-x3, 2)) + (Math.pow(y1-y3, 2)));
		double second = Math.sqrt((Math.pow(x2-x4, 2)) + (Math.pow(y2-y4, 2)));
		
		if(first == second) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
