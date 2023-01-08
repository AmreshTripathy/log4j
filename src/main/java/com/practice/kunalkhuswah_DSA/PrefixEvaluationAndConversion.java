package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class PrefixEvaluationAndConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		valueOfExpression(str);
	}

	private static void valueOfExpression(String str) {
		Stack<Integer> operands = new Stack<Integer>();
		Stack<String> infix = new Stack<String>();
		Stack<String> postfix = new Stack<String>();

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				operands.push(ch - '0');
				infix.push(ch + "");
				postfix.push(ch + "");
			} else {
				int a = operands.pop();
				int b = operands.pop();

				int val = eval(a, b, ch);
				operands.push(val);
				
				infix.push("(" + infix.pop() + ch + infix.pop() + ")");
				postfix.push(postfix.pop() + postfix.pop() + ch);
			}
		}
		
		System.out.println(operands.peek());
		System.out.println(infix.peek());
		System.out.println(postfix.peek());
	}

	private static int eval(int a, int b, char op) {
		if (op == '+')
			return a + b;
		else if (op == '-')
			return a - b;
		else if (op == '*')
			return a * b;
		else
			return a / b;
	}
}
