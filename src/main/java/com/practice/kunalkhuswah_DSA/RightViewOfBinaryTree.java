package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=21d3de29-2828-4145-8aa5-c9d8ab42ee78
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RightViewOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        ArrayList<Integer> lis = rightView(bst.root);
        System.out.println(String.valueOf(lis));
    }

    private static ArrayList<Integer> rightView(TreeNode root) {
        ArrayList<Integer> lis = new ArrayList<>();
        if (root == null)
            return lis;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size(); // calculating size of each level

            while(size > 0) {
                TreeNode temp = q.remove(); // removing element one by one

                if(size == 1) // is size == 1 adding it to the list
                    lis.add(temp.data);
                
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
                size--;
            }
        }


        return lis;
    }
}
