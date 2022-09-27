package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LongestSubstringWithoutRepeatingCharacters {
	
	protected static Scanner sc = new Scanner(System.in);
	public static int lengthOfLongestSubstring(String s) {
		
		String sub_string = "";
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i<s.length(); i++) {
			for(int j =  i; j<s.length(); j++) {
				sub_string += s.charAt(j);
				if(!set.contains(String.valueOf(s.charAt(j))) && !set.contains(sub_string)) {
					set.add(String.valueOf(s.charAt(j)));
//					set.add(sub_string);
				}
				if(!set.contains(sub_string)){
					HashSet<String> set_1 = new HashSet<String>();
					for(String sub_1 : sub_string.split("")) {	
						if(!set_1.contains(sub_1)) {
							set_1.add(sub_1);
							String a = String.join("", set_1);
							if(!set.contains(a)) {
								set.add(a);
								sub_string = a;
							}
						}else {
							sub_string = "";
							break;
						}
					}
//					String a = String.join("", set_1);
//					if(!set.contains(a)) {
//						set.add(a);
////						sub_string = "";
//					}
					
				}
			}
		}
		
		String longest = "";
		
		ArrayList<String> list = new ArrayList<String>(set);
		try {
			longest = list.get(0);
			for (int i=1; i<list.size(); ++i) {
			   if (list.get(i).length() > longest.length()) {
			      longest = list.get(i);
			   }
			}
			
			System.out.println(list.toString());
		}catch(IndexOutOfBoundsException e) {
			 return longest.length();
		}
		
        return longest.length();
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(sc.next()));
	}
}
