package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseInteger {
	
	static Scanner sc = new Scanner(System.in);
	public static int reverse(int x) {
	if(x==0)
        return 0;
    long reverse=0;
    while(x!=0)
    {
        int last_digit = x%10;
        reverse = reverse*10+last_digit;
        x=x/10;
    }
    System.out.println(reverse);
    
    
    if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
    	return 0;
    }
    else
        // System.out.println((int)reverse);
        return (int)reverse;}
	
	public static void main(String[] args) {
		System.out.println(reverse(sc.nextInt()));
	}
	
}
