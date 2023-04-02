package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e4bec89a-4907-4b75-9ff7-f9defb7ba20f
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import com.practice.kunalkhuswah_DSA.BinaryTrees;
import com.practice.kunalkhuswah_DSA.TreeNode;

public class PreorderPostorderInorderInASingleTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        sc.close();

        BinaryTrees bt = new BinaryTrees(arr);
        allTraversal(bt.root);
    }

    static class Pair {
        TreeNode node;
        int stage;

        Pair(TreeNode node, int stage) {
            this.node = node;
            this.stage = stage;
        }
    }

    private static void allTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        Stack<Pair> stk = new Stack<>();
        stk.add(new Pair(root, 0));

        while (stk.size() > 0) {
            Pair temp = stk.peek();

            if (temp.stage == 0) {
                // preorder
                preorder.add(temp.node.data);
                temp.stage++;
                if (temp.node.left != null)
                    stk.add(new Pair(temp.node.left, 0));
            } else if (temp.stage == 1) {
                // inorder
                inorder.add(temp.node.data);
                temp.stage++;
                if (temp.node.right != null)
                    stk.add(new Pair(temp.node.right, 0));
            } else {
                postorder.add(temp.node.data);
                stk.pop();
            }
        }

        printList(preorder);
        System.out.println();
        printList(inorder);
        System.out.println();
        printList(postorder);
    }

    private static void printList(List<Integer> lis) {
        for (int ele : lis)
            System.out.print(ele + " ");
    }
}
