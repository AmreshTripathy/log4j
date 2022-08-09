package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

import org.apache.log4j.Logger;

public class UserInput {

	static final Logger log= Logger.getLogger("UserInput.class");
	public static void main(String[] args) {
		log.debug("Amresh Tripathy");
		System.out.println("Taking Input from User! ");
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		System.out.println(a);
		String b = input.next();
		System.out.println(b);
		
		System.out.println(a + input.nextInt());
		
		
	}

}
