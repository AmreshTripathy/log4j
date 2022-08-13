package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Km_to_mile {

	static final Logger log = Logger.getLogger("Km_to_mile.class");
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kilometer = sc.nextInt();
		//amresh
		log.debug(kilometer * 0.621371);
	}
}
