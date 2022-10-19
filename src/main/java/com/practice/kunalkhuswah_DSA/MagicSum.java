package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MagicSum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println(magicSum(mat));
	}
	private static int magicSum(int[][] mat) {
		
		int sum = 0;
		int recent_sum = 0;
		int i = 0;
		while(i < 3) {
			sum = mat[0][i];
			i++;
		}
		i = 0;
		
		for(int x = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				recent_sum  += mat[x][j];
			}
			if(recent_sum != sum) {
				return 0;
			}
		}
		
		return sum;
	}
}
