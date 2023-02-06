package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

public class BST {
    TreeNode root = null;

    BST() {

    }

    BST(TreeNode root) {
        this.root = root;
    }

    TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (root.data == data)
            return root;
        else if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    void preOrderPrint(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    void inOrderPrint(TreeNode root) {
        if (root == null)
            return;

        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }
}
