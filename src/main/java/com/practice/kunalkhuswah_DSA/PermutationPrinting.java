package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PermutationPrinting {
	
	protected static List<String> answer = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		scn.close();
		permutationPrint(s, 0);
		Collections.sort(answer);
		for(String str: answer) {
			System.out.println(str);
		}
	}

	public static void permutationPrint(String ques, int index) {
		if(index == ques.length()) {
			System.out.println(ques);
			if(!answer.contains(ques))
				answer.add(ques);
			return;
		}
		
		for(int i = 0; i < ques.length(); i++) {
			ques = swap(ques, i, index);
			permutationPrint(ques, index + 1);
			ques = swap(ques, i, index);
		}
	}

	private static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return new String(arr);
	}
}
