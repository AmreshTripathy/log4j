package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MergeTwoSortedLinkedLists {
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
		
		Node head = merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
	}

	private static Node merge(Node x, Node y) {
		Node ans = new Node(-1);
		Node m_ans = ans;
		
		Node temp1 = x;
		Node temp2 = y;
		
		while(temp1 != null && temp2 != null) {
			if(temp1.data < temp2.data) {
				ans.next = temp1;
				temp1 = temp1.next;
			}else {
				ans.next = temp2;
				temp2 = temp2.next;
				
			}
			ans = ans.next;
		}
		
		if(temp1 != null)
			ans.next = temp1;
		
		if(temp2 != null)
			ans.next = temp2;
		
		return m_ans.next;
	}
}
