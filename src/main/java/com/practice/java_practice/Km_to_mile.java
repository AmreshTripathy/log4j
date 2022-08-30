package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Km_to_mile {

	static final Logger log = Logger.getLogger("Km_to_mile.class");
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int kilometer = sc.nextInt();
//		//amresh
//		log.debug(kilometer * 0.621371);
		String a = "amresh";
		StringBuilder b = new StringBuilder();
		b.append(a);
		b.reverse();
		System.out.println(b);
		
		int c = 1234;
		String str = Integer.toString(c);
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		log.debug(sb);
		
	}
}
