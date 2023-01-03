package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SpecialMatrix_Accio {
	static boolean special(int matrix[][], int n){
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i == j || i + j + 1 == n)) {
					if(matrix[i][j] == 0) {
						return false;
					}
				}else if(matrix[i][j] != 0){
						return false;
				}
			}
		}

		return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
             matrix[i][j] = sc.nextInt();
        }
        sc.close();
        boolean ans = special(matrix, n);
        System.out.println(ans);
	}
}
