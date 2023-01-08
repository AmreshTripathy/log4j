package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;
import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(reverseParentheses(str));
	}
	
	public static String reverseParentheses(String s) {
        Stack<Character> stk = new Stack<Character>();

        for(char ch: s.toCharArray()) {
            if(ch == '(')
                stk.push(ch);
            else if(ch == ')') {
                String rev = "";
                while(stk.peek() != '(')
                    rev += stk.pop();
                stk.pop();
                for(int i = 0; i < rev.length(); i++)
                    stk.push(rev.charAt(i));
            }else
                stk.push(ch);
        }
        String ans = "";
        while(stk.size() > 0)
            ans = stk.pop() + ans;

        return ans;
    }
}
