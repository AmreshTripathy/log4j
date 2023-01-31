package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=978382d5-aa6d-4dee-8a1a-b9bda9cd2ddc
 */

import java.util.Scanner;

public class LowestCommonAncestor_Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(findLCA(bst.root, n1, n2).data);
    }

    public static TreeNode findLCA(TreeNode node, int n1, int n2) {
        if(node == null)
            return null;
        
        if(node.data == n1 || node.data == n2)
            return node;

        TreeNode left = findLCA(node.left, n1, n2);
        TreeNode right = findLCA(node.right, n1, n2);

        if(left != null && right != null)
            return node;

        if(left != null)
            return left;
        else if (right != null)
            return right;
        else 
            return null;
    }
}
