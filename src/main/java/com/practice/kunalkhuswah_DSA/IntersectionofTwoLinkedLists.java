package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class IntersectionofTwoLinkedLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedLists l1 = new LinkedLists();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());
		LinkedLists l2 = new LinkedLists();
		int m = sc.nextInt();
		for(int i = 0; i < m; i++)
			l2.addNode(sc.nextInt());
		l1.print();
		l2.print();
		sc.close();
		
		System.out.println(intersectingNode(l1.head, l2.head).data);
		
	}
	
	private static Node intersectingNode(Node headA, Node headB)
	{
		Node temp1 = headA;
		
		while(temp1 != null){
			Node temp2 = headB;
			while(temp2 != null){
				if(temp1.data == temp2.data){
					return temp2;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return null;
	}
}
