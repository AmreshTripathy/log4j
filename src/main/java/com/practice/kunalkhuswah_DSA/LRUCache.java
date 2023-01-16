package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6a8c74ff-60f3-49a6-a929-5e7335416f8e
 * https://leetcode.com/problems/lru-cache/description/
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LRU {
    static class Node {
        int key, val;
        Node next, prev;

        Node() {
            this.key = 0;
            this.val = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    void addNode(Node node) {
        // adding new node at first i.e head --> new node --> old node --> tail
        Node A = head.next;

        node.next = A;
        node.prev = head;

        A.prev = node;
        head.next = node;
    }

    void removeNode(Node node) {
        // removing old node i.e head --> new node --> old node --> tail
        Node a = node.prev;
        Node b = node.next;

        a.next = b;
        b.prev = a;

        node.prev = null;
        node.next = null;
    }

    void moveToFront(Node node) {
        removeNode(node);
        addNode(node);
    }

    Node head;
    Node tail;
    int maxCapacity;

    Map<Integer, Node> cache;

    public LRU(int capacity) {
        head = new Node(); // here both head and tail node value is null to remove side case scenarios
        tail = new Node();

        head.next = tail;
        tail.prev = head;

        cache = new HashMap<Integer, Node>();
        maxCapacity = capacity;
    }

    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;
        else {
            Node node = cache.get(key);
            moveToFront(node);
            return node.val;
        }
    }

    public void set(int key, int value) {
        // cases: 1. updating a value
        //        2. opening a  fresh application

        if(cache.containsKey(key)) {
            // case 1.
            Node node = cache.get(key);
            moveToFront(node);
            node.val = value;
        }else{
            // case 2.
            Node node = new Node(key, value);

            if(maxCapacity == cache.size()) {
                Node lruNode = tail.prev;
                cache.remove(lruNode.key);
                removeNode(lruNode);
            }

            cache.put(key, node);
            addNode(node);
        }
    }
}

public class LRUCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt(), q = sc.nextInt();
        String[] queries = new String[q];
        for (int i = 0; i < q; i++) {
            String s = sc.next();
            if (s.equals("GET"))
                s += " " + sc.nextInt();
            else
                s += " " + sc.nextInt() + " " + sc.nextInt();
            queries[i] = s;
        }
        sc.close();
        LRU lruCache = new LRU(cap);
        for (String s : queries) {
            String[] arr = s.split(" ");
            if (arr.length == 3)
                lruCache.set(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            else
                System.out.println(lruCache.get(Integer.parseInt(arr[1])));
        }
    }
}
