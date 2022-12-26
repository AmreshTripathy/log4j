package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class QuickSort_on_LinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists l = new LinkedLists();
		
		for(int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		
		l.print();
		sc.close();
		
		Node end = l.head;
		
		while(end.next != null) end = end.next;
		
		quickSort(l.head, end);
		
		l.print();
	}

	private static void quickSort(Node start, Node end) {
		if(start == null || start == end || start == end.next)
			return;
		
		Node pivotPrev = partitionLast(start, end);
		quickSort(start, pivotPrev);
		
		if(pivotPrev != null && pivotPrev == start)
			quickSort(pivotPrev.next, end);
		else if(pivotPrev != null && pivotPrev.next != null)
			quickSort(pivotPrev.next.next, end);
	}

	private static Node partitionLast(Node start, Node end) {
		
		if(start == end || start == null || end == null)
			return start;
		
		Node pivotPrev = start;
		Node curr = start;
		int pivot = end.data;
		
		while(start != end) {
			if(start.data <= end.data) {
				pivotPrev = curr;
				int temp = curr.data;
				curr.data = start.data;
				start.data = temp;
				curr = curr.next;
			}
			start = start.next;
		}
		
		int temp =  curr.data;
		curr.data = pivot;
		end.data = temp;
		
		return pivotPrev;
	}
}
