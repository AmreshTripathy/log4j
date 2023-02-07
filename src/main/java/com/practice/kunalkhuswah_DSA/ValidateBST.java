package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3b992182-31dd-4aaa-a4fd-914a6a9669ff
 */

import java.util.Scanner;

public class ValidateBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        BinaryTrees bt = new BinaryTrees(arr);
        sc.close();
        System.out.println(isBST(bt.root));
    }

    private static boolean isBST(TreeNode root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

	private static boolean helper(TreeNode node, int lf, int rf) {
		if(node == null)
			return true;

		if(lf >= node.data || node.data >= rf)
			return false;
		boolean isLeft = helper(node.left, lf, node.data);
		boolean isRight = helper(node.right, node.data, rf);

		return isLeft && isRight;
	}
}
