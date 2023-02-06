package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3a25fd86-4629-49a4-ae39-abb4978e4a4d
 */

import java.util.Scanner;

public class SearchANodeInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();

        t.print(t.root);
        System.out.println();
        System.out.println(searchNode(t.root, k));
    }

    private static boolean searchNode(BST_Node root, int k) {
        if (root == null)
            return false;

        if (root.data == k)
            return true;
        else if (k < root.data)
            return searchNode(root.left, k);
        else
            return searchNode(root.right, k);
    }
}
