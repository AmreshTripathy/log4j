package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ac1af0fe-d5d6-4279-b47c-9787423ab256
 */

import java.util.Scanner;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        postOrderTraversal(bst.root);
    }

    private static void postOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
