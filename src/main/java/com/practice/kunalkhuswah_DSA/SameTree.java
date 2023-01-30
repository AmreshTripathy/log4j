package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=249439ec-42db-41ff-af2b-d14a69763904
 */

import java.util.Scanner;

public class SameTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        BinaryTrees bst = new BinaryTrees(arr);
        str = sc.nextLine();
        arr = str.split(" ");
        sc.close();
        BinaryTrees bst_1 = new BinaryTrees(arr);
        areTreesIdentical(bst.root, bst_1.root);
    }

    private static void areTreesIdentical(TreeNode root1, TreeNode root2) {
        if(isIdentical(root1, root2))
			System.out.println("YES");
		else
			System.out.println("NO");
    }

    private static boolean isIdentical(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;

        if(root1 != null && root2 != null)
            return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);

        return false;
    }
}
