package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class UnfoldLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		LinkedLists l1 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		sc.close();
		l1.print();
		
		Node nd = unfold(l1.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node unfold(Node head) {
		
		Node even_index = new Node(-1);
		Node even = even_index;
		Node odd_index = new Node(-1);
		Node odd = odd_index;
		
		Node temp = head;
		int index = 0;
		while(temp != null) {
			if(index % 2 == 0) {
				even_index.next = new Node(temp.data);
				even_index = even_index.next;
			}else {
				odd_index.next = new Node(temp.data);
				odd_index = odd_index.next;
			}
			temp = temp.next;
			index++;
		}
		
		odd = reverse(odd.next);
		
		even_index.next = odd;
		return even.next;
	}
	
	private static Node reverse(Node head) {
		if(head == null) return head;
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
