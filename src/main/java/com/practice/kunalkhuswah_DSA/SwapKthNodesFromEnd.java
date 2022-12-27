package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SwapKthNodesFromEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedLists l = new LinkedLists();
		
		for(int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		
		int k = sc.nextInt();
		sc.close();
		
		l.head = swapkthnode(l.head, n, k);
		l.print();
	}

	private static Node swapkthnode(Node head, int n, int k) {
		
		if(head == null || head.next == null) return head;
		
		if(n % 2 != 0 && (n / 2) + 1 == k)
			return head;
		
		Node temp = head;
		Node temp1 = head;
		int count = 1;
		
		while(count != k && temp != null) {
			temp = temp.next;
			count++;
		}
		
		count = 1;
		while(count != (n - k + 1) && temp1 != null) {
			temp1 = temp1.next;
			count++;
		}
		
		int num = temp.data;
		temp.data = temp1.data;
		temp1.data = num;
		
		return head;
	}
}
