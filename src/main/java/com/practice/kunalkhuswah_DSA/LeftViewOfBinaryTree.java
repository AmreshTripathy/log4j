package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e5bc5b24-fb3f-4112-9bb0-461f44306650
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftViewOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        letfView(bst.root);
    }

    private static void letfView(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size(); // calculating size of each level
			System.out.print(q.peek().data + " ");
            while(size > 0) {
                TreeNode temp = q.remove(); // removing element one by one

                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
                size--;
            }
        }
    }
}
