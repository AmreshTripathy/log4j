package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Reverse_Nodes_in_k_Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists l = new LinkedLists();
		
		for(int i = 0; i < n; i++) l.addNode(sc.nextInt());
		
		int k = sc.nextInt();
		sc.close();
		l.print();
		
		l.head = reverseKGroup(l.head, k);
		l.print();
	}

	private static Node reverseKGroup(Node head, int k) {
		
		Node temp = head;
		Node ans2 = temp;
		Node reversed = new Node(-1);
		Node ans = reversed;
		
		int count = 1;
		while(temp != null) {
			if(count == k) {
				reversed.next = temp;
				reversed = reversed.next;
				Node end = temp.next;
				reversed.next = null;
				reversed = reverse(ans.next);
				Node temp1 = reversed;
				while(temp1.next != null)
					temp1 = temp1.next;
				temp1.next = end;
				ans = reversed;
				temp = reversed;
				count = 1;
			}
			count++;
			reversed.next = temp;
			temp = temp.next;
			reversed = reversed.next;
		}
		return head;
	}

	private static Node reverse(Node head) {
		if(head == null || head.next == null) return head;
		
		Node prev = null; Node cur = head; Node curNext = head.next;
		
		while(cur != null) {
			curNext = cur.next;
			cur.next = prev;
			prev = cur;
			cur = curNext;
		}
		
		return prev;
	}
}
