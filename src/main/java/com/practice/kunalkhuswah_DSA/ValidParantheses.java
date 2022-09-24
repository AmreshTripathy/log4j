package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class ValidParantheses {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static boolean isValid(String s) {
		if(s.length()%2!=0)
	        return false;
	    
	    char chars[] = s.toCharArray();
	    Stack<Character> stk = new Stack<Character>();
	    
	    for(char ch : chars)
	    {
	        if(ch=='(' || ch=='{' || ch=='[')
	            stk.push(ch);
	        else
	        {
	            if(stk.empty())
	                return false;
	            
	            if(ch==')' && stk.pop()!='(')
	            {
	                return false;
	            }
	            if(ch=='}' && stk.pop()!='{')
	            {
	                return false;
	            }
	            if(ch==']' && stk.pop()!='[')
	            {
	                return false;
	            }
	            
	        }
	    }
	    return stk.empty();
	}
	
	public static void main(String[] args) {
		System.out.println(isValid(sc.next()));
	}
}
