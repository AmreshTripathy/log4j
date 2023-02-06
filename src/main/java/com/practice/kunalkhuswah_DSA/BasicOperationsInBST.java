package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=4be84bda-20ca-44bb-bb2e-05dc9f6dc057
 */

import java.util.Scanner;

public class BasicOperationsInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        int data = sc.nextInt();
        sc.close();

        t.inOrderPrint(t.root);
        System.out.println();
        int size = size(t.root);
        int sum = sum(t.root);
        int max = max(t.root);
        int min = min(t.root);
        boolean found = find(t.root, data);

        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(found);
    }

    public static int size(TreeNode node) {
        if (node == null)
            return 0;

        return size(node.left) + 1 + size(node.right);
    }

    public static int sum(TreeNode node) {
        if (node == null)
            return 0;

        int lh = sum(node.left);
        int rh = sum(node.right);

        return lh + node.data + rh;
    }

    public static int max(TreeNode node) {
        TreeNode temp = node;

        while (temp.right != null)
            temp = temp.right;

        return temp.data;
    }

    public static int min(TreeNode node) {
        TreeNode temp = node;

        while (temp.left != null)
            temp = temp.left;

        return temp.data;
    }

    public static boolean find(TreeNode node, int data) {
        if (node == null)
            return false;

        if (node.data == data)
            return true;
        else if (data < node.data)
            return find(node.left, data);
        else
            return find(node.right, data);
    }
}
