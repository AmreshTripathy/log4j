package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class MinimumParanthesis {
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = MinimumParantheses(s);
        System.out.println(ans);
        sc.close();
    }
	
	static int MinimumParantheses(String s){
        char chars[] = s.toCharArray();
	    Stack<Character> stk = new Stack<Character>();

		int count = 0;
	    for(char ch : chars)
	    {
	        if(ch=='(' || ch=='{' || ch=='['){
	            stk.push(ch);
				count++;
			}else
	        {
				if(stk.empty()) {
					count++;
				}else if(ch==')' && stk.pop()=='(') {
	                count--;
	            }else if(ch=='}' && stk.pop()=='{') {
	                count--;
	            }else if(ch==']' && stk.pop()=='[') {
	                count--;
	            }else{
					count++;
				}
	            
	        }
	    }
	    return count;
    }
}
