package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

class BST_Node {
    int data;
    BST_Node left;
    BST_Node right;

    BST_Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    BST_Node root = null;

    BST() {

    }

    BST(BST_Node root) {
        this.root = root;
    }

    BST_Node insert(BST_Node root, int data) {
        if (root == null) {
            root = new BST_Node(data);
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

    void print(BST_Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        print(root.left);
        print(root.right);
    }
}
