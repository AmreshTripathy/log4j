package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PartitioningALinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		LinkedLists l1 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		int x = sc.nextInt();
		sc.close();
		l1.print();
		
		Node nd = partition(l1.head, x);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node partition(Node head, int x) {
		Node temp = head;
		Node lessStart = null;
		Node moreStart = null;
		Node lessEnd =null;
		Node moreEnd =null;

		while(temp!=null){
			
			if(temp.data < x){

				if(lessEnd == null){
					lessStart = temp;
					lessEnd = temp;
				}else{
					lessEnd.next = temp;
					lessEnd = lessEnd.next;
				}	
			}else{

				if(moreEnd == null){
					moreStart = temp;
					moreEnd = temp;
				}else{
					moreEnd.next = temp;
					moreEnd = moreEnd.next;
				}
				
			}

			temp = temp.next;
		}

		lessEnd.next = moreStart;
		moreEnd.next = null;
		
		return lessStart;
	}
}
