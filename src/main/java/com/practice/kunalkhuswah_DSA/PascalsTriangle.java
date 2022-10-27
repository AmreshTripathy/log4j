package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PascalsTriangle {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		List<List<Integer>> lis = new ArrayList<List<Integer>>();
		
		lis = generate(sc.nextInt());
		System.out.print(lis.toString());
	}
	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> main_lis = new ArrayList<List<Integer>>();
		
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(1);
		main_lis.add(lis);
		if(numRows == 1) {
			return main_lis;
		}
		lis = new ArrayList<Integer>();;
		lis.add(1);
		lis.add(1);
		main_lis.add(lis);
		if(numRows == 2) {
			return main_lis;
		}
		for(int i = 2; i < numRows; i++) {
			
		}
		
		return main_lis;
	}
}
