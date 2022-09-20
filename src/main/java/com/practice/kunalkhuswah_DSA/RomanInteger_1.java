package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RomanInteger_1 {
	
	protected static Scanner sc =  new Scanner(System.in);
	public static int romanToInt(String s) {
        // roman numeral is written from largest to smallest
        // except in cases where subtraction occurs
        // using this to form the number via extracting a digit one by one and finding the sum of all
        int num = 0;
        int prevNumber = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int thisNum = convertToInt(s.charAt(i));
            
            if (prevNumber < thisNum) {
                // subtracting it out from num as it must have been added in else step
                num = num - prevNumber;
                // forming the proper num to add
                num += thisNum - prevNumber;
            } else {
                num += thisNum;
            }
            
            prevNumber = thisNum;
        }
        
        return num;
    }
    
    public static int convertToInt(Character ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        
        throw new Error("Illegal");
    }
    
    public static void main(String[] args) {
		System.out.println(romanToInt(sc.next()));
	}
}
