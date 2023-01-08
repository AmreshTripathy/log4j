package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CoditionalProblem {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String ch =  sc.next();
		
		if(ch.equals("A")) {
			System.out.println("I am the first letter");
		}else if(ch.equals("B")) {
			System.out.println("I am the second letter");
		}else if(ch.equals("C")) {
			System.out.println("I am the third letter");
		}else if(ch.equals("D")) {
			System.out.println("I am the fourth letter");
		}else if(ch.equals("E")) {
			System.out.println("I am the fifth letter");
		}else {
			System.out.println("I don't belong here");
		}
	}
}
