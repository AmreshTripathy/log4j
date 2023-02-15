package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=83be7387-e686-464e-8c8a-be5a00bf4a37
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class TimeToBurnTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int k = sc.nextInt();
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(timeToBurnTree(bst.root, k));
    }

    static class Pair {
        TreeNode node;
        int time;

        Pair(TreeNode node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    private static int timeToBurnTree(TreeNode root, int k) {

        Map<TreeNode, TreeNode> map = new HashMap<>();
        int ans = 0;

        addParent(root, map);

        TreeNode start = findNode(root, k);

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, 0));

        while (q.size() > 0) {
            int size = q.size();

            while (size > 0) {
                Pair temp = q.remove();
                ans = temp.time;

                if (map.containsKey(temp.node)) {
                    q.add(new Pair(map.get(temp.node), temp.time + 1));
                }

                if (temp.node.left != null) {
                    q.add(new Pair(temp.node.left, temp.time + 1));
                }

                if (temp.node.right != null) {
                    q.add(new Pair(temp.node.right, temp.time + 1));
                }

                size--;
            }
        }

        return ans;
    }

    private static TreeNode findNode(TreeNode root, int k) {
        if(root == null)
            return null;

        if(root.data == k)
            return root;
        
        findNode(root.left, k);
        findNode(root.right, k);

        return null;
    }

    private static void addParent(TreeNode root, Map<TreeNode, TreeNode> map) {
        if(root == null)
            return;
            
        if(root.left != null) {
            map.put(root.left, root);
            addParent(root.left, map);
        }

        if(root.right != null) {
            map.put(root.right, root);
            addParent(root.right, map);
        }
    }
}
