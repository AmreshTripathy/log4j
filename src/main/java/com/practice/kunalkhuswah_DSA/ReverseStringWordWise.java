package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseStringWordWise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverseWords(s));
		sc.close();
	}

	private static String reverseWords(String s) {
		List<String> lis = new ArrayList<String>(Arrays.asList(s.split(" ")));
		Collections.reverse(lis);
		return String.join(" ", lis);
	}
}
