package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=336f7410-3904-4cf9-be1b-47773cfae7b4
 */

import java.util.Scanner;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(height(bst.root));
    }

    private static int height(TreeNode root) {
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }
}
