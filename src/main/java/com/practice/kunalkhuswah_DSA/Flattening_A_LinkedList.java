package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Flattening_A_LinkedList {
	static class Node {

		int data;
		Node right, down;

		Node(int data) {
			this.data = data;
			right = null;
			down = null;
		}
	}

	static Node flatten(Node root) {
		if (root == null || root.right == null)
			return root;
		root.right = flatten(root.right);
		root = sortNodeOfLeftAndRigth(root, root.right);
		return root;
	}

	private static Node sortNodeOfLeftAndRigth(Node left, Node right) {

		if (left == null)
			return right;
		if (right == null)
			return left;

		Node result = null;

		if (left.data <= right.data) {
			result = left;
			result.down = sortNodeOfLeftAndRigth(left.down, right);
		} else {
			result = right;
			result.down = sortNodeOfLeftAndRigth(left, right.down);
		}

		return result;
	}

	static void printList(Node head) {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.down;
		}
		System.out.println();
	}

	public static boolean isCorrect(Node claim) {
		if (claim.right != null)
			return true;
		Node copy = claim;
		while (copy.down != null) {
			if (copy.down.data < copy.data)
				return true;
			copy = copy.down;
		}
		return false;
	}

	// Driver's code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node ll = new Node(-1), prev1 = null, head = ll;
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			Node prev2 = null, copy = ll;
			while (k-- != 0) {
				int val = sc.nextInt();
				copy.data = val;
				copy.down = new Node(-1);
				prev2 = copy;
				copy = copy.down;
			}
			prev2.down = null;
			ll.right = new Node(-1);
			prev1 = ll;
			ll = ll.right; 
		}
		sc.close();
		prev1.right = null;
		Node flattenedNode = flatten(head);
		printList(flattenedNode);
		if (isCorrect(flattenedNode))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
