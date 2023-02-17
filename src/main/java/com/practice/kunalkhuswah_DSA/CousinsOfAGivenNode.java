package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://practice.geeksforgeeks.org/problems/cousins-of-a-given-node/1
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class CousinsOfAGivenNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        TreeNode node_to_find = new TreeNode(5);
        ArrayList<Integer> lis = printCousins(bst.root, node_to_find);
        System.out.println(lis);
    }

    private static ArrayList<Integer> printCousins(TreeNode root, TreeNode node_to_find) {
        ArrayList<Integer> lis = new ArrayList<>();
        if (root == node_to_find)
            return lis;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        getParent(root, map);
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0) {
            int size = q.size();
            
            boolean flag = false;
            
            while(size > 0) {
                TreeNode temp = q.remove();
                
                if(temp.left != null) {
                    q.add(temp.left);
                    if (temp.left.data == node_to_find.data)
                        flag = true;
                }
                
                if(temp.right != null) {
                    q.add(temp.right);
                    if (temp.right.data == node_to_find.data)
                        flag = true;
                }
                size--;
            }
            
            if(flag)
                break;
        }
        
        int parent = map.containsKey(node_to_find.data) ? map.get(node_to_find.data) : Integer.MIN_VALUE;
        if(parent == Integer.MIN_VALUE)
            return lis;
        
        while(q.size() > 0) {

            if(map.get(q.peek().data) != parent) {
                lis.add(q.peek().data);
            }
            q.remove();
        }
        
        return lis;
    }

    public static void getParent(TreeNode root, Map<Integer, Integer> map) {
        if(root == null)
            return;
            
        if(root.left != null)
            map.put(root.left.data, root.data);
            
        if(root.right != null)
            map.put(root.right.data, root.data);
            
        getParent(root.left, map);
        getParent(root.right, map);
    }
}
