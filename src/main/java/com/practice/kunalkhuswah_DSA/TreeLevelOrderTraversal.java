package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b630c0be-f168-423f-9d7a-f3c4acfc36e6
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeLevelOrderTraversal {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class BST {
        TreeNode root;

        TreeNode constructBST (TreeNode root, int val) {

            if(this.root == null) {
                this.root = new TreeNode(val);
                return this.root;
            }

            TreeNode temp = root;

            while(root != null) {
                if(val > root.data) {
                    if(root.right == null) {
                        root.right = new TreeNode(val);
                        break;
                    }else
                        root = root.right;
                }else if(val < root.data) {
                    if(root.left == null) {
                        root.left = new TreeNode(val);
                        break;
                    }else
                        root = root.left;
                }
            }

            return temp;
        }

        Queue<TreeNode> q = new LinkedList<>();
        void levelOrderTraversal(TreeNode root) {
            if(root == null)
                return;

            q.add(root);
            while(!q.isEmpty()) {
                TreeNode temp = q.remove();
                System.out.print(temp.data + " ");
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BST bt = new BST();
        for (int i = 0; i < n; i++)
            bt.root = bt.constructBST(bt.root, sc.nextInt());

        sc.close();

        bt.levelOrderTraversal(bt.root);
    }
}
