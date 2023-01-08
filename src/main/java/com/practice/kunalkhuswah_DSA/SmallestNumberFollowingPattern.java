package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=efcb1e58-c615-48b1-a7ed-def039965808
 */

public class SmallestNumberFollowingPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(smallestNumber(str));
	}

	private static String smallestNumber(String str) {
		Stack<Integer> st = new Stack<Integer>();
		String ans = "";
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'd')
				st.push(count++);
			else {
				st.push(count++);
				while(st.size() > 0) 
					ans += st.pop();
			}
		}
		st.push(count++);
		while(st.size() > 0) 
			ans += st.pop();
		
		return ans;
	}
}
