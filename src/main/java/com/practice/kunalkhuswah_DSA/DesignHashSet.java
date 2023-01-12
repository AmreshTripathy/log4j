package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=bit4Jn-ZoyQ&list=TLGGW5wad86UQbExMTAxMjAyMw&t=7s
 */

import java.util.*;

class Solution2 {
	List<Integer>[] hashTable;
	int size = 750000;
	
	Solution2() {
		hashTable = new LinkedList[size];
	}
	
	public int hashFunction(int key) {
		return key % size;
	}

	public void add(int key) {
		int i = hashFunction(key);
		
		if(hashTable[i] == null) {
			hashTable[i] = new LinkedList<>();
		}
		
		if(hashTable[i].indexOf(key) == -1) {
			hashTable[i].add(key);
		}
	}

	public void remove(int key) {
		
		int i = hashFunction(key);
		
		if(hashTable[i] == null || hashTable[i].indexOf(key) == -1)
			return;
		
		if(hashTable[i].indexOf(key) != -1)
			hashTable[i].remove(key);
	}

	public boolean contains(int key) {
		
		int i = hashFunction(key);
		
		if (hashTable[i] == null || hashTable[i].indexOf(key) == -1) {
            return false;
        }
		
		return true;
	}
}

public class DesignHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Solution2 Obj = new Solution2();
		for (int i = 0; i < q; i++) {
			int choice = sc.nextInt();
			int key = sc.nextInt();
			if (choice == 1) {
				// Add
				Obj.add(key);
			} else if (choice == 2) {
				// contains
				if (Obj.contains(key)) {
					System.out.print("True ");
				} else {
					System.out.print("False ");
				}
			} else if (choice == 3) {
				// remove
				Obj.remove(key);
			}
		}
		System.out.println();
		sc.close();
	}
}