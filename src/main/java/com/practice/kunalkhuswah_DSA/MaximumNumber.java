package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaximumNumber {
	
	public static int max_number(int n) {
		int maxnum=0;

		int i=1;
		while(n/i>=0 ){
			int newnum=(n/(i*10))*i+n%i;
			if(Integer.toString(newnum).length() >= Integer.toString(n).length()) {
				return maxnum;
			}
			i=i*10;
			if(maxnum<newnum){
				maxnum=newnum;
			}
	}

	return maxnum;

	}
	
	public static void main(String[] args) {
		System.out.println(max_number(new Scanner(System.in).nextInt()));
	}
}
