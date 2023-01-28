package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a8e99a89-cde0-4f26-9570-49dff12b7624
 */

import java.util.Scanner;

public class SizeSumMaximumAndHeightOfABinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(sizeOfTree(bst.root));
        System.out.println(sumOfTree(bst.root));
        System.out.println(maxOfTree(bst.root));
        System.out.println(heightOfTree(bst.root));
    }

    private static int sizeOfTree(TreeNode root) {
        // if root is null return 0
        if(root == null)
            return 0;
        
        // finding size of left node
        int leftSize = sizeOfTree(root.left);
        // finding size of right node
        int rightSize = sizeOfTree(root.right);

        // returning the size including self
        // totalSize = leftSize + 1(mySelf) + rightSize
        return leftSize + 1 + rightSize;
    }

    private static int sumOfTree(TreeNode root) {
        // if root is null return 0
        if(root == null)
            return 0;

        // finding sum of left node
        int leftSize = sumOfTree(root.left);
        // finding sum of right node
        int rightSize = sumOfTree(root.right);

        // returning the sum including self
        // totalSum = leftSize + root.data(mySelf) + rightSize
        return leftSize + root.data + rightSize;
    }

    private static int maxOfTree(TreeNode root) {
        // if root is null return 0
        if(root == null)
            return Integer.MIN_VALUE;

        // finding max in left node
        int leftMax = maxOfTree(root.left);
        // finding max in right node
        int rightMax = maxOfTree(root.right);

        // returning the max including self
        // max = Math.max(root.data, Math.max(leftMax, rightMax));
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    private static int heightOfTree(TreeNode root) {
        // if root is null return 0
        if(root == null)
            return 0;

        // finding Height in left node
        int leftHeight = heightOfTree(root.left);
        // finding Height in right node
        int rightHeight = heightOfTree(root.right);

        // returning the Height including self
        // height = Math.max(leftHeight, rightHeight) + 1;;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
