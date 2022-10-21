package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CheckIfEveryRowAndColumnContainsAllNumbers {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println(checkValid(mat));
	}
	
	public static boolean checkValid(int[][] matrix) {
		
		int size = matrix.length;
		
		ArrayList<Integer> lis = new ArrayList<Integer>();
		for(int i = 1; i  <= size; i++)
			lis.add(i);
		List<Integer> row_modified_list =  new ArrayList<Integer>(lis);
		List<Integer> column_modified_list =  new ArrayList<Integer>(lis);
		
		for(int i = 0; i  < size; i++) {
			for(int j = 0; j < size; j++) {
				if(row_modified_list.contains(matrix[i][j])) {
					row_modified_list.remove(row_modified_list.indexOf(matrix[i][j]));
				}
				if(column_modified_list.contains(matrix[j][i])) {
					column_modified_list.remove(column_modified_list.indexOf(matrix[j][i]));
				}
			}
			if(!row_modified_list.isEmpty() || !column_modified_list.isEmpty()) {
				return false;
			}
			row_modified_list =  new ArrayList<Integer>(lis);
			column_modified_list =  new ArrayList<Integer>(lis);
		}
		
        return true;
    }
}
