package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RemoveLinkedListCycle {
	static class Node {
		int data;
		Node next;
	}

	public static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	public static void makeLoop(Node head, int x) {
		if (x == 0)
			return;
		Node curr = head;
		Node last = head;

		int currentPosition = 1;
		while (currentPosition < x) {
			curr = curr.next;
			currentPosition++;
		}

		while (last.next != null)
			last = last.next;
		last.next = curr;
	}

	public static boolean detectLoop(Node head) {
		Node hare = head.next;
		Node tortoise = head;
		while (hare != tortoise) {
			if (hare == null || hare.next == null)
				return false;
			hare = hare.next.next;
			tortoise = tortoise.next;
		}
		return true;
	}

	public static int length(Node head) {
		int ret = 0;
		while (head != null) {
			ret += 1;
			head = head.next;
		}
		return ret;
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		Node head = newNode(num);
		Node tail = head;
		for (int i = 0; i < n - 1; i++) {
			num = sc.nextInt();
			tail.next = newNode(num);
			tail = tail.next;
		}
		int pos = sc.nextInt();
		makeLoop(head, pos);
		removeLoop(head);
		if (detectLoop(head) || length(head) != n)
			System.out.println("-1");
		else
			printList(head);
		sc.close();

	}

	public static void removeLoop(Node node) {
		Node slow = node;
		Node fast = node;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				slow = node;
				while (fast.next != slow.next) {
					fast = fast.next;
					slow = slow.next;
				}
				fast.next = null;
			}
		}
	}
}
