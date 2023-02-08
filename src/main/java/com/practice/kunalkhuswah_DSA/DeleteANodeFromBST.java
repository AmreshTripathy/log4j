package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=51bd72c5-4874-4108-95b0-65900d4e5ef8
 */

import java.util.Scanner;

public class DeleteANodeFromBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();
        t.root = deleteNode(t.root, k);
        t.preOrderPrint(t.root);
    }

    private static TreeNode deleteNode(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.data == val) {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null && root.right != null)
                return root.right;
            else if (root.left != null && root.right == null)
                return root.left;
            else {
                // after deleting we need to replace that node with right minimum
                int minVal = getMin(root.right);
                root.data = minVal;
                root.right = deleteNode(root.right, minVal);
            }
        }else if (val < root.data)
            root.left = deleteNode(root.left, val);
        else
            root.right = deleteNode(root.right, val);

        return root;
    }

    private static int getMin(TreeNode root) {
        TreeNode temp = root;

        while (temp.left != null)
            temp = temp.left;

        return temp.data;
    }
}
