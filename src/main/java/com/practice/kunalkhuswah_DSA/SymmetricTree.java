package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e81eafdb-0965-4651-b3a3-ac61b70ff8da
 */

import java.util.Scanner;

public class SymmetricTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        isSymmetrical(bst.root);
    }

    private static void isSymmetrical(TreeNode root) {
        if(root == null || isSymmetric(root.left, root.right))
            System.out.println("YES");
        else
            System.out.println("No");
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) 
            return left == right;

        if (left.data != right.data)
            return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
