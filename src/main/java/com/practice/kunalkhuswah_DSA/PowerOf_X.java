package com.practice.kunalkhuswah_DSA;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PowerOf_X {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(check(x, y)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	private static boolean check(int x, int y) {
		
		double pow = Math.log(y) / Math.log(x);
		DecimalFormat df = new DecimalFormat("#.#########");
		if(String.valueOf(pow) == "Infinity") {
			return false;
		}
		double d = Double.valueOf(df.format(pow));
		
		if(d == (int)pow) {
			return true;
		}
		
		return false;
	}
}
