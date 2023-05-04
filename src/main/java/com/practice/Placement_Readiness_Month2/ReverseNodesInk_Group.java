package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

import com.practice.kunalkhuswah_DSA.LinkedLists;
import com.practice.kunalkhuswah_DSA.Node;

public class ReverseNodesInk_Group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedLists l1 = new LinkedLists();

        for (int i = 0; i < n; i++) {
            l1.addNode(sc.nextInt());
        }

        int k = sc.nextInt();
        sc.close();

        l1.print();

        l1.head = reverseKGroup(l1.head, k);
        l1.print();
    }

    private static Node reverseKGroup(Node head, int k) {

        int length = lengthOfLinkedList(head);
        int loopCount = length / k;
        Node ans = null;
        Node tail = null;

        Node pre = null, curr = head, curNext = head.next;
        while (loopCount-- > 0) {
            int count = k;
            while (count-- > 0) {
                curNext = curr.next;
                curr.next = pre;
                pre = curr;
                curr = curNext;
            }

            if (ans == null) {
                ans = pre;
                tail = ans;
            } else {
                tail.next = pre;
            }

            while (tail.next != null)
                tail = tail.next;

            pre = null;
        }

        tail.next = curr;

        return ans;
    }

    private static int lengthOfLinkedList(Node head) {

        int len = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }

        return len;
    }
}
