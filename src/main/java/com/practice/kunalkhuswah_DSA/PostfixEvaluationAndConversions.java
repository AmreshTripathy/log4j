package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluationAndConversions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		valueOfExpression(str);
	}

	private static void valueOfExpression(String str) {
		Stack<Integer> operands = new Stack<Integer>();
		Stack<String> infix = new Stack<String>();
		Stack<String> prefix = new Stack<String>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				operands.push(ch - '0');
				infix.push(ch + "");
				prefix.push(ch + "");
			} else {
				int b = operands.pop();
				int a = operands.pop();

				int val = eval(a, b, ch);
				operands.push(val);
				String b1 = infix.pop();
				String a1 = infix.pop();
				infix.push("(" + a1 + ch + b1 + ")");

				b1 = prefix.pop();
				a1 = prefix.pop();
				prefix.push(ch + a1 + b1);
			}
		}

		System.out.println(operands.peek());
		System.out.println(infix.peek());
		System.out.println(prefix.peek());
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
