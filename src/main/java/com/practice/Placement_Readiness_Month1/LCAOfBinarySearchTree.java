package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a565901c-8445-4cb5-8e0a-364907fef51e
 */

import java.util.Scanner;

import com.practice.kunalkhuswah_DSA.BST;
import com.practice.kunalkhuswah_DSA.TreeNode;

public class LCAOfBinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BST bst = new BST();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            bst.root = bst.insert(bst.root, sc.nextInt());

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        System.out.println(LCA(bst.root, n1, n2).data);
    }

    private static TreeNode LCA(TreeNode root, int n1, int n2) {
        if (root == null)
            return null;

        if (n1 < root.data && n2 < root.data)
            return LCA(root.left, n1, n2);

        if (n1 > root.data && n2 > root.data)
            return LCA(root.right, n1, n2);

        return root;
    }
}
