package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class A_Maze_Path {
	public static void aMazePaths(int n, int m, String ans) {
		if (n == 1 && m == 1) {
			System.out.println(ans);
			return;
		}
		
		if(n < 1 || m < 1) return;
		
		aMazePaths(n, m-1, ans + "h");
		aMazePaths(n-1, m, ans + "v");

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		aMazePaths(n, m, "");
	}
}
