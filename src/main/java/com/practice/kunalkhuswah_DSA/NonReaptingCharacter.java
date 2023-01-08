package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.*;

/*
 * @Amresh Tripathy
 */

public class NonReaptingCharacter {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.next();
        nonRepeatingCharacter(s);  
	}
	
	private static void nonRepeatingCharacter(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character ch: s.toCharArray()) {
			if(map.containsKey(ch)) {
        		map.put(ch, map.get(ch)+1);
        	}else {
        		map.put(ch, 1);
        	}
		}
		
		boolean found = false;
		for(Character ch: s.toCharArray()) {
        	if(map.get(ch) == 1) {
        		System.out.println(ch);
        		found = true;
        		break;
        	}
        }
        
		if(!found) {
			System.out.println(-1);
		}
	}
}
