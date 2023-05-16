package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 */

import java.util.Scanner;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedLists l = new LinkedLists();
        for (int i = 0; i < n; i++)
            l.addNode(sc.nextInt());

        sc.close();
        l.head = swapPairs(l.head);
        l.print();
    }

    private static Node swapPairs(Node head) {
        pairWiseSwap(head);
        return head;
    }

    private static void pairWiseSwap(Node head) {
        if (head == null || head.next == null)
            return;

        int temp = head.data;
        head.data = head.next.data;
        head.next.data = temp;
        pairWiseSwap(head.next.next);
    }
}
