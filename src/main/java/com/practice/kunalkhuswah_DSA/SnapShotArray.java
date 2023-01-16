package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=5f0966c6-068f-4ff3-b532-621cfaa4d90c
 * https://leetcode.com/problems/snapshot-array/description/
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnapShotArray {

    // SC: O(N * M) -> N length of array, M Number of snapshots
    static int snapCount;
    static Map<Integer, Integer>[] map;

    public static void SnapshotArray(int length) {
        map = new HashMap[length];
        snapCount = 0;
    }

    public static void set(int index, int val) {
        if(map[index] == null)
            map[index] = new HashMap<Integer, Integer>();
        
        map[index].put(snapCount, val);
    }

    public static int snap() {
        snapCount++;
        return snapCount - 1;
    }

    public static int get(int index, int snap_id) {
        if(map[index] == null)
            return 0;
        
        // get the last snap_id where this mapArray[index] got updated
        while(snap_id >= 0 && map[index].containsKey(snap_id) == false)
            snap_id--;

        if(snap_id == -1)
            return 0;

        return map[index].get(snap_id);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String temp;
		int param1, param2;
		param1 = input.nextInt();
        SnapshotArray(param1);
        // String[] arr = new String[n];
		for (int i = 0; i < n; i++){

            temp = input.next();
		    if(temp.equals("set") || temp.equals("get"))
            {
              param1 = input.nextInt();
              param2 = input.nextInt();
              if(temp.equals("set"))
              {
                  set(param1, param2);
              }
              else{
                  System.out.println(get(param1, param2));
              }
            }
            else{
                System.out.println(snap());
            }
		}
        input.close();
	}
}
