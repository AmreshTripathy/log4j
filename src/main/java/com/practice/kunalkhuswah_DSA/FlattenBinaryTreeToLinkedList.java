package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=1c50f3f3-002a-4f76-837e-0ce9822345e2
 */

import java.util.Scanner;

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        flatten(bst.root);
        printInorder(bst.root);
    }

    private static void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    private static void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.left);
        flatten(root.right);

        TreeNode temp1 = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode temp2 = root;
        while (temp2.right != null)
            temp2 = temp2.right;
        temp2.right = temp1;
    }
}
