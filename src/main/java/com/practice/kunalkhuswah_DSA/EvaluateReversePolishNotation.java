package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class EvaluateReversePolishNotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.next();
		sc.close();
		
		System.out.println(evalRPN(arr));
	}
	
	public static int evalRPN(String[] tokens) {
        Stack<Integer> opd = new Stack<Integer>();

        for(int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")) {
                int b = opd.pop();
                int a = opd.pop();
                opd.push(eval(a, b, str));
            }else{
                opd.push(Integer.parseInt(str));
            }
        }

        return opd.peek();
    }

    private static int eval(int a, int b, String ch) {
        if(ch.equals("+"))
            return a + b;
        else if(ch.equals("-"))
            return a - b;
        else if(ch.equals("/"))
            return a / b;
        else
            return a * b;
    }
}
