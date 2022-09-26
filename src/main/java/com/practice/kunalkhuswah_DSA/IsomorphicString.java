package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class IsomorphicString {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static boolean isIsomorphic(String s, String t) {
		Map m = new HashMap();
		for (Integer i=0; i<s.length(); ++i)
		if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i))
		return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print(isIsomorphic(sc.next(), sc.next()));
	}
}
