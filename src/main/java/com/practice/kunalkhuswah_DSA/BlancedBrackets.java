package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class BlancedBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		System.out.print(isPar(str));
	}

	private static boolean isPar(String str) {
		
		if(str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') return false;

		Stack<Character> st = new Stack<Character>();
		try {
			for(char ch: str.toCharArray()) {
				if(ch == '(' || ch == '{' || ch == '[') {
					st.push(ch);
				}else {
					boolean flag = false;
					if(ch == ')' && st.peek() == '(') {
						st.pop();
						flag = true;
					}else if(ch == '}' && st.peek() == '{') {
						st.pop();
						flag = true;
					}else if(ch == ']' && st.peek() == '[') {
						st.pop();
						flag = true;
					}
					
					if(!flag)
						return false;
				}
			}
		}catch(Exception EmptyStackException) {
			return false;
		}
		
		return st.isEmpty();
	}
}
