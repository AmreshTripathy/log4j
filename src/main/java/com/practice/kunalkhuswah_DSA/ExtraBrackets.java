package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;
import java.util.Stack;

public class ExtraBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		System.out.print(extraBrackets(str));
	}

	private static boolean extraBrackets(String str) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(char ch: str.toCharArray()) {
			if(ch != ')')
				st.push(ch);
			else {
				boolean flag =  false;
				while(st.peek() != '(') {
					flag = true;
					st.pop();
				}
				
				if(flag)
					st.pop();
				else
					return true;
			}
		}
		
		return false;
	}
}
