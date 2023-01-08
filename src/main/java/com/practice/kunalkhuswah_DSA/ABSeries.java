package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ABSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
        System.out.print(series(n));
	}
	
	public static int series(int n){
        if(n == 1)
        	return 0;
        if(n == 2)
        	return 1;
        
        return series(n-2) * series(n-2) - series(n-1);
  }
}
