package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/delete-node-in-a-bst/description/
 */

import java.util.Scanner;

import com.practice.kunalkhuswah_DSA.BST;
import com.practice.kunalkhuswah_DSA.TreeNode;

public class DeleteNodeFromBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BST t = new BST();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        int key = sc.nextInt();
        sc.close();

        t.root = deleteNode(t.root, key);
        t.levelOrder(t.root);
    }

    private static TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (root.data == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if(root.left == null && root.right != null) {
                return root.right;
            } else {
                int minVal = getMin(root.right);
                root.data = minVal;
                root.right = deleteNode(root.right, minVal);
            }
        } else if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    private static int getMin(TreeNode root) {
        TreeNode temp = root;

        while (temp.left != null)
            temp = temp.left;

        return temp.data;
    }
}
