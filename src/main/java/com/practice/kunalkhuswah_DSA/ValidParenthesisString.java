package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		System.out.print(checkValidString(str));
	}
	
	public static boolean checkValidString(String s) {
		if (s == null) {
			return true;
		}
		Stack<Integer> stackLeft = new Stack<Integer>();
		Stack<Integer> stackStar = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stackLeft.push(i);
			} else if (s.charAt(i) == '*') {
				stackStar.push(i);
			} else if (s.charAt(i) == ')') {
				if (!stackLeft.isEmpty()) {
					stackLeft.pop();
				} else if (!stackStar.isEmpty()) {
					stackStar.pop();
				} else {
					return false;
				}
			}
		}
		
		while(!stackLeft.isEmpty() && !stackStar.isEmpty()) {
			int starIndex = stackStar.pop();
			int leftIndex = stackLeft.pop();
			
			if(starIndex < leftIndex)
				return false;
		}
		return stackLeft.isEmpty();
	}
}
