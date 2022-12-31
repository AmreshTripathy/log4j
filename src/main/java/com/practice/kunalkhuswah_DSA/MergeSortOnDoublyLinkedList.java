package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MergeSortOnDoublyLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	static class LinkedList {
		Node head;

		void add(int data) {
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
				return;
			}
			Node curr = head;
			while (curr.next != null)
				curr = curr.next;
			curr.next = new_node;
			new_node.prev = curr;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		LinkedList a = new LinkedList();
		for (int i = 0; i < n; i++) {
			a.add(input.nextInt());
		}
		input.close();
		a.head = mergesort(a.head);
		Node h = a.head;
		while (h != null) {
			System.out.print(h.data + " ");
			h = h.next;
		}
	}

	private static Node mergesort(Node head) {

		if (head == null || head.next == null)
			return head;

		Node last = split(head);

		head = mergesort(head);
		last = mergesort(last);

		return merge(head, last);
	}

	private static Node merge(Node head, Node last) {

		if (head == null)
			return last;
		if (last == null)
			return head;

		Node result = null;

		if (head.data <= last.data) {
			result = head;
			result.next = merge(head.next, last);
			result.next.prev = result;
			result.prev = null;
		} else {
			result = last;
			result.next = merge(head, last.next);
			result.next.prev = result;
			result.prev = null;
		}

		return result;
	}

	private static Node split(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node temp = slow.next;
		slow.next = null;

		return temp;
	}
}
