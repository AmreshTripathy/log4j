package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Problem6 {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] mat = new int[5][5];
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				mat[i][j] =  sc.nextInt();
		
		System.out.println(lowerTriangularMatrix(mat));
	}
	
	private static String lowerTriangularMatrix(int[][] mat) {
		
		for(int i = 0; i < 5; i++){
			for(int j = i+1; j < 5; j++) {
				if(mat[i][j] != 0) {
					return "NO";
				}
			}
		}
		
		return "YES";
	}
}
