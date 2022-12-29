package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RemoveZeroSumConsecutiveNodesfromLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists l = new LinkedLists();
		
		for(int i = 0; i < n; i++) l.addNode(sc.nextInt());
		
		sc.close();
		l.print();
		
		l.head = removeZeroSumSublists(l.head);
		l.print();
	}

	private static Node removeZeroSumSublists(Node head) {
		Node temp = head;
		Node ans = new Node(-1);
		Node ans2 = ans;

        while(temp != null){
        	Node temp1 = temp;
            int sum = 0;
            while(temp1 != null) {
                sum += temp1.data;
                if(sum == 0) {
                    ans.next = temp1.next;
                    return removeZeroSumSublists(ans2.next);
                }
                temp1 = temp1.next;
            }
            ans.next = new Node(temp.data);
            ans = ans.next;
            temp = temp.next;
        }

        return head;
	}
}
