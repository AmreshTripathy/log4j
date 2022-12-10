package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MazeProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		printMazePaths(0, 0, n - 1, m - 1, "");
	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		if (sr > dr || sc > dc)
			return;

		for (int i = 1; i <= dc; i++) {
			printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
		}

		for (int i = 1; i <= dr; i++) {
			printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
		}
		
		for (int i = 1; i <= dr; i++) {
			printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
		}
	}
}
