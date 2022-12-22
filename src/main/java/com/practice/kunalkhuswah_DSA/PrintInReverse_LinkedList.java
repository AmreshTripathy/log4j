package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintInReverse_LinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedLists l = new LinkedLists();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		sc.close();
		l.print();
		
		reverse(l.head);
		
	}

	private static void reverse(Node head) {
		// TODO Auto-generated method stub
		
		Node pre = null; Node cur = head;  Node curNext = head.next;
		
		while(cur != null) {
			curNext = cur.next;
			cur.next = pre;
			pre = cur;
			cur = curNext;
		}
		
		while (pre != null) {
            System.out.print(pre.data + " ");
            pre = pre.next;
        }
	}
}
