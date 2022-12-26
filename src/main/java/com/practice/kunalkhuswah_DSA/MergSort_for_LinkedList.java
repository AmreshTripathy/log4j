package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MergSort_for_LinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists l = new LinkedLists();
		
		for(int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		
		l.print();
		sc.close();
		Node node = mergeSort(l.head);
		
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	private static Node mergeSort(Node head) {
		
		if(head == null || head.next == null) return head;
		
		Node mid = getMidNode(head);
		Node nextMidElementsNode = mid.next;
		
		mid.next = null;
		
		Node left = mergeSort(head);
		Node right = mergeSort(nextMidElementsNode);
		
		Node sortedNode = sortNodeOfLeftAndRigth(left, right);
		
		return sortedNode;
	}

	private static Node sortNodeOfLeftAndRigth(Node left, Node right) {
		
		if(left == null) return right;
		if(right == null) return left;
		
		Node result = null;
		
		if(left.data <= right.data) {
			result = left;
			result.next = sortNodeOfLeftAndRigth(left.next, right);
		}else {
			result = right;
			result.next = sortNodeOfLeftAndRigth(left, right.next);
		}
		
		return result;
	}

	private static Node getMidNode(Node head) {
		
		if(head == null) return head;
		
		Node slow = head, fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
}
