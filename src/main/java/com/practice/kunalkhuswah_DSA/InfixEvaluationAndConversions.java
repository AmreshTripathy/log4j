package com.practice.kunalkhuswah_DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class InfixEvaluationAndConversions {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();
		br.close();
		evaluate(exp);
	}

	private static void evaluate(String exp) {
		System.out.println(solve(exp));
		
		convert(exp);
	}

	private static void convert(String exp) {
		Stack<String> postfix = new Stack<String>();
		Stack<String> prefix = new Stack<String>();
		
		
		Stack<Character> operators = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (Character.isDigit(ch)) {
				
				postfix.push(ch + "");
				prefix.push(ch + "");
				
			} else if (ch == '(') {
				operators.push(ch);
			} else if (ch == ')') {
				while (operators.peek() != '(') {
					char opr = operators.pop();
					
					String postV2 = postfix.pop();
					String postV1 = postfix.pop();
					
					String ans = postV1 + postV2 + opr;
					
					postfix.push(ans);

					String preV2 = prefix.pop();
					String preV1 = prefix.pop();
					
					String ans2 = opr + preV1 + preV2;
					
					prefix.push(ans2);
				}
				// remove ( at last
				
				operators.pop();
			} else {
				while(operators.size() > 0 && operators.peek() != '(' && precedance(ch) <= precedance(operators.peek())) {
					char opr = operators.pop();
					
					String postV2 = postfix.pop();
					String postV1 = postfix.pop();
					
					String ans = postV1 + postV2 + opr;
					
					postfix.push(ans);

					String preV2 = prefix.pop();
					String preV1 = prefix.pop();
					
					String ans2 = opr + preV1 + preV2;
					
					prefix.push(ans2);
				}
				operators.push(ch);
			}
		}
		
		while(operators.size() > 0) {
			char opr = operators.pop();
			
			String postV2 = postfix.pop();
			String postV1 = postfix.pop();
			
			String ans = postV1 + postV2 + opr;
			
			postfix.push(ans);

			String preV2 = prefix.pop();
			String preV1 = prefix.pop();
			
			String ans2 = opr + preV1 + preV2;
			
			prefix.push(ans2);
		}
		
		System.out.println(postfix.peek());
		System.out.println(prefix.peek());
	}

	private static int solve(String exp) {
		/*
		 * Step 1: create 2 stack one for numbers and one for operators
		 * */
		Stack<Integer> operands = new Stack<Integer>();
		Stack<Character> operators = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (Character.isDigit(ch)) {
				operands.push(exp.charAt(i) - '0');
			} else if (ch == '(') {
				operators.push(ch);
			} else if (ch == ')') {
				while (operators.peek() != '(') {
					int b = operands.pop();
					int a = operands.pop();
					char opr = operators.pop();

					int val = eval(a, b, opr);
					operands.push(val);
				}
				// remove ( at last
				
				operators.pop();
			} else {
				while(operators.size() > 0 && operators.peek() != '(' && precedance(ch) <= precedance(operators.peek())) {
					int b = operands.pop();
					int a = operands.pop();
					char opr = operators.pop();

					int val = eval(a, b, opr);
					operands.push(val);
				}
				operators.push(ch);
			}
		}
		
		while(operators.size() > 0) {
			int b = operands.pop();
			int a = operands.pop();
			char opr = operators.pop();

			int val = eval(a, b, opr);
			operands.push(val);
		}

		return operands.peek();
	}

	private static int precedance(char operator) {
		if (operator == '+' || operator == '-')
			return 1;
		else
			return 2;
	}

	private static int eval(int a, int b, char ch) {
		if (ch == '/')
			return a / b;
		else if (ch == '*')
			return a * b;
		else if (ch == '+')
			return a + b;
		else
			return a - b;
	}
}
