package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedLists l1 = new LinkedLists();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());
		sc.close();
		l1.print();
		System.out.println(checkLinkedListPalindrome(l1.head));
	}
	
	static String checkLinkedListPalindrome(Node head)
    {
		List<Integer> lis = new ArrayList<Integer>();
		while(head != null){
			lis.add(head.data);
			head = head.next;
		}

		List<Integer> temp = new ArrayList<Integer>(lis);
		Collections.reverse(lis);
		if(temp.equals(lis))
			return "YES";
		return "NO";
		
    }
}
