package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class ASSorting1_SortMatrixColumnWise {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
         int n=sc.nextInt();
         int m=sc.nextInt();
         
         int[][] mat =new int[n][m];
         
         for(int i=0;i<n;i++)
           for(int j=0;j<m;j++)
               mat[i][j] = sc.nextInt();
         
         printMatrix(mat, n, m);
         
         sc.close();
         sortCol(mat, n, m);
	}

	private static void sortCol(int[][] mat, int n, int m) {
		
		for(int i = 0; i < m; i++) {
			
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) {
				arr[j] = mat[j][i];
			}
			
			Arrays.sort(arr);
			
			for(int j = 0; j < n; j++) {
				mat[j][i] = arr[j];
			}
		}
		
		printMatrix(mat, n, m);
	}
	
	private static void printMatrix(int[][] mat, int n, int m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
