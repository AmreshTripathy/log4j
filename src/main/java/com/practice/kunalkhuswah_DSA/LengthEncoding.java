package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.LinkedList;
import java.util.Scanner;

public class LengthEncoding {
    static class Node {
        int data;
        int count;
        Node next;

        Node() {
            this.data = 0;
            this.count = 0;
        }

        Node(int data, int count) {
            this.data = data;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();

        LinkedList<Node> l = convertArrayTOLinkedList(arr, n);
        for (Node nd : l) {
            System.out.println(nd.data + " " + nd.count);
        }
    }

    private static LinkedList<Node> convertArrayTOLinkedList(int[] arr, int n) {

        LinkedList<Node> l = new LinkedList<>();
        Node nd = new Node();

        int count = 1;
        int pre = arr[0];

        for (int i = 1; i < n; i++) {
            if (pre == arr[i]) {
                count++;
            } else {
                if (nd == null) {
                    nd = new Node(pre, count);
                } else {
                    nd.next = new Node(pre, count);
                }
                count = 1;
                nd = nd.next;
                l.add(nd);
            }
            pre = arr[i];
        }

        // adding the last element 
        nd.next = new Node(pre, count);
        nd = nd.next;
        l.add(nd);

        return l;
    }
}
