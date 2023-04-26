package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=d9c74b53-b470-4fce-9d24-879f3679b524
 * https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/description/
 */

import java.util.Scanner;
import com.practice.kunalkhuswah_DSA.BinaryTrees;
import com.practice.kunalkhuswah_DSA.TreeNode;

public class MaximumProductOfSplittedBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arr = str.split(" ");
        BinaryTrees bt = new BinaryTrees(arr);
        System.out.println(maxProduct(bt.root));
    }

    static long ans = 0, totalSum = 0, subTreeSum;

    private static int maxProduct(TreeNode root) {

        // find max product at each subtree sum (totalSum - subTreeSum) * subTreeSum
        totalSum = getProductSum(root);
        getProductSum(root);

        return (int) (ans % (int) (1e9 + 7));
    }

    private static long getProductSum(TreeNode root) {
        if (root == null)
            return 0;

        subTreeSum = root.data + getProductSum(root.left) + getProductSum(root.right);

        ans = Math.max((totalSum - subTreeSum) * subTreeSum, ans);

        return subTreeSum;
    }
}
