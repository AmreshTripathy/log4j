package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/check-completeness-of-a-binary-tree/
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckCompletenessOfABinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bt = new BinaryTrees(arr);
        System.out.println(isCompleteTree(bt.root));
    }

    private static boolean isCompleteTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size();

            if (q.peek().data == -1)
                break;

            while (size > 0) {
                TreeNode temp = q.remove();
                size--;

                if (temp.data == -1 && q.size() > 0 && q.peek().data != -1)
                    return false;

                if (temp.left != null)
                    q.add(temp.left);
                else
                    q.add(new TreeNode(-1));

                if (temp.right != null)
                    q.add(temp.right);
                else 
                    q.add(new TreeNode(-1));

            }
        }

        while (q.size() > 0)
            if (q.remove().data != -1)
                return false;

        return true;
    }
}
