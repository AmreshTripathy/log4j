package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class Staircase {
	protected static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = sc.nextInt();
		
		
//		FOR PATTERN
//		# 
//		# #
//		# # #
//		# # # #
		
//		for(int i = 0; i<num; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}
		
//		FOR PATTERN
//		      #
//		    # #
//		  # # #
//		# # # #
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j <= num; j++) {
				if ((i + j) > num) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
			}
			System.out.println();
		}
		
		int c = (int) Math.round(Math.sqrt(num));
	}
}
