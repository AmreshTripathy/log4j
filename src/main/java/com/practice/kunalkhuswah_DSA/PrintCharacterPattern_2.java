package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintCharacterPattern_2 {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int count = 65;
		int count_i = 65;
                
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				if(count == 91) {
					count = 65;
				}
				System.out.printf("%c", count++);	
			}
			count_i++;
			if(count_i == 91) {
				count_i = 65;
			}
			count = count_i;
			System.out.println();
		}
	}
}
