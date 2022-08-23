package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

import org.apache.log4j.Logger;

public class FindPercentage {
	
	static final Logger log = Logger.getLogger("FindPercentage.class");
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++ ) {
			log.debug("Insert No."+i);
			sum += sc.nextInt();
		}
		String a;
		float percent = (sum * 100) / 500;
		log.debug("Percentage is "+ percent);
	}
}
