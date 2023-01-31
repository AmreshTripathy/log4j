package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c1c361bd-7aa2-49e7-801d-60996615cfd1
 */

import java.util.Scanner;

public class MaximumPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(findMaxSum(bst.root));
    }

    private static int findMaxSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxSum(root, max);
        return max[0];
    }

    private static int maxSum(TreeNode root, int max[]) {
        if(root == null)
            return 0;

        int ls = Math.max(0, maxSum(root.left, max));
        int rs = Math.max(0, maxSum(root.right, max));

        max[0] = Math.max(max[0], ls + rs + root.data);
        return root.data + Math.max(ls, rs);
    }
}
