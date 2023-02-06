package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e552caac-75e2-4f1e-8aee-a49ae6c08134
 */

import java.util.Scanner;

public class InsertANodeInABST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();

        t.inOrderPrint(t.root);
        System.out.println();
        t.root = insertNode(t.root, val);
        t.inOrderPrint(t.root);
    }

    private static BST_Node insertNode(BST_Node root, int val) {
        if(root == null) {
			return new BST_Node(val);
		}
		if(root.data == val)
			return root;
		
		if(val < root.data)
			root.left = insertNode(root.left, val);
		else
			root.right = insertNode(root.right, val);

		return root;
    }
}
