package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */


import java.util.Scanner;
import org.apache.log4j.Logger;

public class UserInput {

	static final Logger log= Logger.getLogger("UserInput.class");
	public static void main(String[] args) {
//		log.debug("Amresh Tripathy");
//		log.debug("Taking Input from User! ");
//		@SuppressWarnings("resource")
//		Scanner input = new Scanner(System.in);
//		float a = input.nextFloat();
//		log.debug(a);
//		String b = input.next();
//		log.debug(b);
//		log.debug(a + input.nextInt());
		
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j< 5; j++) {
				count++;
			}
		}
		
		log.debug(count);
	}

}
