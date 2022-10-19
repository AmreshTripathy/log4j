package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @Amresh Tripathy
 */

public class IsSubsequence {
	protected static Scanner sc = new Scanner(System.in);
	
	public static boolean isSubsequence(String s, String t) {
		
		boolean char_equal = false;
		
		ArrayList<String> a_set = new ArrayList<String>();
		
		if(s.isEmpty())
			return true;
		
		for(char s_ch : s.toCharArray()) {
			for(char t_ch : t.toCharArray()) {
				if(s_ch == t_ch) {
					char_equal = true;
				}
			}
			if(!char_equal)
				return false;
		}
		Pattern p = Pattern.compile("(["+s+"])");
		Matcher m = p.matcher(t);
		while(m.find()) {
			String a = m.group();
			if(!a_set.contains(a))
				a_set.add(a);
		}
		
		if(s.equalsIgnoreCase(String.join("", a_set))) {
			return true;
		}
		p = Pattern.compile("("+String.join("", a_set)+")");
		m = p.matcher(t);
		while(m.find() && !a_set.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isSubsequence(sc.next(), sc.next()));
	}
}
