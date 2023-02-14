package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/add-binary/description/
 */

import java.math.BigInteger;
import java.util.Scanner;

public class AddBinary_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        BigInteger A = new BigInteger(a,2);
		BigInteger B = new BigInteger(b,2);
		
		return ((A.add(B)).toString(2));
    }
}
