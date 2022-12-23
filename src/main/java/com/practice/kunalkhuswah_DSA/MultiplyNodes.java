package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MultiplyNodes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		LinkedLists l1 = new LinkedLists();
		LinkedLists l2 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		for (int i = 0; i < m; i++)
			l2.addNode(sc.nextInt());

		sc.close();
		l1.print();
		l2.print();

		System.out.println(multiply(l1.head, l2.head));
	}

	private static long multiply(Node head1, Node head2) {
		
		long mod = 1000000007;
		
		long num1 = 0; long num2 = 0;
		
		while(head1 != null || head2 != null) {
			if(head1 != null) {
				num1 = ((num1 * 10) % mod + head1.data);
				head1 = head1.next;
			}
			
			if(head2 != null) {
				num2 = ((num2 * 10) % mod + head2.data);
				head2 = head2.next;
			}
			
		}
		
		return ((num1 % mod) * (num2 % mod)) % mod;
	}
}
