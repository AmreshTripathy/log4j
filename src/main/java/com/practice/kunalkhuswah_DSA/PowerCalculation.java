package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PowerCalculation {
	public static long xPowerN(int x, int n)
	{
       if(n == 0)
    	   return 1;
       long value = xPowerN(x, n/2);
       if(n % 2 == 0)
    	   return value * value;
       return x * value * value;
	}
	public static void main(String[] args)
	{
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
    		int n = sc.nextInt();
    		sc.close();
    		System.out.println(xPowerN(x, n));
		
	}
}
