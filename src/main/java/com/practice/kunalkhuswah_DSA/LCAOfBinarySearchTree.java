package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ac71e808-aca8-4148-8e01-5b1c2422ed63
 */

import java.util.Scanner;

public class LCAOfBinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();
        
        System.out.println(LCA(t.root, n1, n2).data);
    }

    private static TreeNode LCA(TreeNode root, int n1, int n2) {
        if(root == null)
            return null;
        
        if(n1 < root.data && n2 < root.data)
            return LCA(root.left, n1, n2);

        if(n1 > root.data && n2 > root.data)
            return LCA(root.right, n1, n2);
        
        return root;
    }
}
