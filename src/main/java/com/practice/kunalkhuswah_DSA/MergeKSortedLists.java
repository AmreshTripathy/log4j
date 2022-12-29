package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MergeKSortedLists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] lists = new Node[n];
		
		for(int i = 0; i < n; i++) {
			int size = sc.nextInt();
			LinkedLists l = new LinkedLists();
			for(int j = 0; j < size; j++) {
				l.addNode(sc.nextInt());
			}
			l.print();
			lists[i] = l.head;
		}
		
		sc.close();
		LinkedLists l = new LinkedLists();
		l.head = mergeKLists(lists);
		l.print();
	}

	private static Node mergeKLists(Node[] lists) {
		if(lists.length == 1) return lists[0];
		
		int n = lists.length;
		
		Node masterNode = null;
		for(int i = 1; i < n; i++) {
			if(i == 1) {
				masterNode = merge(lists[i-1], lists[i]);
			}else {
				masterNode = merge(masterNode, lists[i]);
			}
		}
		return masterNode;
	}

	private static Node merge(Node head1, Node head2) {
		
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		Node ans = new Node(-1);
		Node result = ans;
		
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
		
		while(temp1 != null) {
			ans.next = temp1;
			ans = ans.next;
			temp1 = temp1.next;
		}
		
		while(temp2 != null) {
			ans.next = temp2;
			ans = ans.next;
			temp2 = temp2.next;
		}
		
		return result.next;
	}
}
